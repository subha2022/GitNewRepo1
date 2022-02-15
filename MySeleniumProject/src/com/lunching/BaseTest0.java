package com.lunching;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseTest0 {
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");//current project root directory
	public static Properties p;
	public static FileInputStream fis;
	public static Properties mainprop;
	public static Properties childprop;
	public static Properties orProp;
	public static ExtentReports report; //declare html file
	public static ExtentTest test; 
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectpath+"\\data.properties");
		p = new Properties();
		p.load(fis);
		String value = p.getProperty("firefoxbrowser");
		System.out.println(value);
		
		fis = new FileInputStream(projectpath+"\\environment.properties");
		mainprop = new Properties();
		mainprop.load(fis);
		
		String e = mainprop.getProperty("env");
		System.out.println(e);
		 		
		fis = new FileInputStream(projectpath+"\\"+e+".properties");
		childprop=new Properties();
		childprop.load(fis);
		 
		String url = childprop.getProperty("amazonurl");
		System.out.println(url);
		
		fis = new FileInputStream(projectpath+"\\or.properties");
		orProp = new Properties();
		orProp.load(fis);
		
		fis= new FileInputStream("C:\\Users\\pabitra\\git\\GitNewRepo1\\MySeleniumProject\\log4j.properties");
		PropertyConfigurator.configure(fis);
		
		report = ExtentManager.getInstance(); // html file initialize
	}
			
	public static void luncher(String browser)
	{
					
		if(p.getProperty(browser).equals("chrome")) // for creating user defined chrome browser
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\pabitra\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 6");
			
			// How to Handle Notification
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized"); //to get maximized the window
			option.addArguments("--ignore-certificate-errors-spki-list"); //for certificate error
			//option.addArguments("--proxy-server=https://192.168.10.1.9898");//for proxy ip settings and port
						
			driver = new ChromeDriver(option);
		}
				
		else if(p.getProperty(browser).equals("firefox")) // for creating user defined firefox browser
		{
			ProfilesIni p =new ProfilesIni();
			FirefoxProfile profile = p.getProfile("Jan2022FF");
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			// Notifications
			profile.setPreference("dom.webnotifications.enabled", false);
			
			// Certificate Errors
			
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			
			// How to  work with Proxy Settings
			profile.setPreference("network.proxy.type", 1);
			profile.setPreference("network.proxy.socks", "192.168.10.1");
			profile.setPreference("network.proxy.socks_port", 1744);
			
			driver = new FirefoxDriver(option);
			
		}
	}

	public static void navigateUrl(String url)
	{
		driver.get(childprop.getProperty(url));
	}
	
	
	// for web locator
	
	public static void clickElement(String locatorKey )
	{
	//	driver.findElement(By.id(orProp.getProperty(locatorKey))).click();
		getElement(locatorKey).click();
	}

	public static void typeText(String locatorKey, String text)
	{
		//driver.findElement(By.name(orProp.getProperty(locatorKey))).sendKeys(text);
		getElement(locatorKey).sendKeys(text);
	}

	public static void selectOption(String locatorKey, String option)
	{
		//driver.findElement(By.xpath(orProp.getProperty(locatorKey))).sendKeys(option);
		getElement(locatorKey).sendKeys(option);
	}
	
	//for making keys dynamic 
	
	
	public static WebElement getElement(String locatorKey) 
	{
	WebElement element = null;
	
	//check for element present
	if(!isElementPresent(locatorKey))
		// report a failure
		
		System.out.println("Element is not present :"+ locatorKey);
		
	element = driver.findElement(getLocator(locatorKey));
		
	/*	if(locatorKey.endsWith("_id"))
		{
			driver.findElement(By.id(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name"))
		{
			driver.findElement(By.name(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_classname"))
		{
			driver.findElement(By.className(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath"))
		{
			driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css"))
		{
			driver.findElement(By.cssSelector(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linktext"))
		{
			driver.findElement(By.linkText(orProp.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_partiallinktext"))
		{
			driver.findElement(By.partialLinkText(orProp.getProperty(locatorKey)));
		}*/
		return element;
	}
// for element present
	public static boolean isElementPresent(String locatorKey)
	{
		System.out.println("Check for element Present.....");
		WebDriverWait wait = new WebDriverWait(driver, 60);//for explicitly wait
		
		try {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
			
			/*if(locatorKey.endsWith("_id"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_name"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_classname"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_xpath"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_linktext"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_partiallinktext"))
			{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(orProp.getProperty(locatorKey))));
			}*/
		} catch (Exception e) 
		{
			
			return false;
		}
		
		return true;
	}
	public static By getLocator(String locatorKey)
	{
		By by= null;
		if(locatorKey.endsWith("_id"))
		{
			by= By.id(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_name"))
		{
			by = By.name(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_classname"))
		{
			by = By.className(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_xpath"))
		{
			by = By.xpath(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_cssselector"))
		{
			by = By.cssSelector(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_linktext"))
		{
			by = By.linkText(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("-partiallinktext"))
		{
			by = By.partialLinkText(orProp.getProperty(locatorKey));
		}
		
		return by;
	}
	// ************ Verifications *****************
	
	
	public static boolean isLinksEqual(String expectedLink)
	{
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		
		if(actualLink.equals(expectedLink))
			return true;
		else
		return false;
	}
	
	// ********* Reporting *************************
	
	
	public static void reportsuccess(String successMsg) 
	{
		test.log(Status.PASS, successMsg);
	}

	public static void reportfailure(String failureMsg) throws Exception
	{
		test.log(Status.FAIL, failureMsg);
		takeScreenshot();
	}

	public static void takeScreenshot() throws Exception
	{
		Date dt = new Date();
		System.out.println(dt);
		String d = dt.toString().replace(':','_').replace(' ', '_');
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File(projectpath+"//failuarescreenshot//"+d));
		
		test.log(Status.INFO, "Screendhot---->" + test.addScreenCaptureFromPath(projectpath+"//failuarescreenshot//"+d));
	}




	
}



