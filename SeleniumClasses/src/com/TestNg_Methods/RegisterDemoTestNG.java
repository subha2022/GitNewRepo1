package com.TestNg_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterDemoTestNG extends MultiBrowserTesting{

	//public WebDriver driver;

	// Parameterized all input value
	//String url = "https://nxtgenaiacademy.com/";
	String firstName = "Subhasmita";
	String lastName = "Jena";
	String gender = "Female";
	String streetAddress = "Chansandra";
	String aptName = "Isha Mistry Green";
	String cityName = "Bangalore";
	String stateName = "Karnatak";
	String postalCode = "560067";
	String countryName = "India";
	String emailId = "subhasmitadoll@gmail.com";
	String dateOfDemo = "2/10/2023";
	String hhInput = "05";
	String mmInput = "10";
	String mobileNumber = "7853860002";
	String course1 = "Selenium WebDriver";
	String course2 = "TestNG";
	String enterYourQuery = "Which Topics are included in Selenium class.";
	String successfullMessageText = "Registration form is successfully submited.";

	// Parameterized all webelement path
	String demoSitesLinkText = "Demo Sites";
	String practiceAutomationLink = "Practice Automation";
	//String registrationDemoPageParLink = "Registration Form";
	String registrationDemoPageXpath = "(//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-4134\"])[2]";
	String regForDemoXpath = "//h3[text()='Register For Demo']";
	String firstNameId = "vfb-5";
	String lastNameNameLoc = "vfb-7";
	String genderIdLoc = "vfb-31-2";
	String streetAddNameLoc = "vfb-13[address]";
	String aprtmentAddIdLoc = "vfb-13-address-2";
	String cityAddNameLoc = "vfb-13[city]";
	String stateAddNameLoc = "vfb-13[state]";
	String postalAddIdLoc = "vfb-13-zip";
	String countryXpathLoc = "(//span[contains(@class,'select2-selection select2-selection--single')])[1]";
	String emailIDLoc = "vfb-14";
	String dateNameLoc = "vfb-18";
	String hhIdLoc = "item-vfb-16";
	String mmIdLoc = "item-vfb-16";
	String mobNoIdLoc = "vfb-19";
	String course1IdLoc = "vfb-20-0";
	String course2IdLoc = "vfb-20-2";
	String queryIdLoc = "vfb-23";
	String verificationNameLoc = "vfb-3";
	String submitNameLoc = "vfb-submit";
	String regMsgXpath = "//div[contains(@class,'elementor-widget-container')]";
	
	/*@BeforeClass
	public void lunchApplication() {
		// Set the system property for chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		// Create object instance for chrome driver
		driver = new ChromeDriver();
		// Lunch the application
		driver.get(url);
		// Maximize the window
		driver.manage().window().maximize();
		Reporter.log("Application is lunched");
		
	}

	@AfterClass
	public void closeApplication() {
		driver.close();
		Reporter.log("Application is closed");
	}*/

	@Test(priority = 1)
	public void NavigateToResgisterDemo() {
		//Create Actions Class
		Actions action = new Actions(driver);
		//Click Demo Sites link
		WebElement demoSites = driver.findElement(By.linkText(demoSitesLinkText));
		//Mouse over action
		action.moveToElement(demoSites).perform();
		//Click Practice Automation link
		WebElement praAutomation = driver.findElement(By.linkText(practiceAutomationLink));
		//Mouse over action
		action.moveToElement(praAutomation).perform();
		//Click Register Demo Page
		WebElement regDemoPage = driver.findElement(By.xpath(registrationDemoPageXpath));
		//Mouse Over action
		action.moveToElement(regDemoPage).click().perform();
		Reporter.log("Register Demo Page is Clicked");
		Reporter.log("Navigate to Registration Demo Page");
	}

	@Test(priority = 2)
	public void registerUser()  {
		//Fill all the data in Registration form
		//First Name
	
		WebElement firstNamedata = driver.findElement(By.id(firstNameId));
		//Enter the value
		firstNamedata.sendKeys(firstName);
		//Validating first name is displayed or not
		if(firstNamedata.isDisplayed())
		{
			Reporter.log("First Name is dispalyed");
			Reporter.log("The First Name value is:"+firstName);
		}else
		{
			Reporter.log("First Name is not dispalyed");
		}

		//last Name
		WebElement lastNamedata = driver.findElement(By.name(lastNameNameLoc));
		//Enter the value
		lastNamedata.sendKeys(lastName);
		//Validating first name is displayed or not
		if(lastNamedata.isDisplayed())
		{
			Reporter.log("Last Name is dispalyed");
			Reporter.log("The Last Name value is:"+lastName);
		}else
		{
			Reporter.log("Last Name is not dispalyed");
		}
		//Female Radio Button
		WebElement femaleRadioBtn = driver.findElement(By.id(genderIdLoc));
		femaleRadioBtn.click();
		//Validating the Radio Button is selected or not
		if(femaleRadioBtn.isSelected())
		{
			Reporter.log("Female Radio Button is selected");
		}else
		{
			Reporter.log("Female Radio Button is not selected");
		}
		// Enter Address

		//Street Address
		WebElement StreetData = driver.findElement(By.name(streetAddNameLoc));
		StreetData.sendKeys(streetAddress);
		//Validating StreetAddress is displayed or not
		if(StreetData.isDisplayed())
		{
			Reporter.log("The Street Address is displayed");
			Reporter.log("The Street Address Value is:"+streetAddress);
		}else
		{
			Reporter.log("The Street Address is not displayed");
		}
		//Apartment Address
		WebElement aptData = driver.findElement(By.id(aprtmentAddIdLoc));
		aptData.sendKeys(aptName);
		//Validating the apartment address is displayed or not
		if(aptData.isDisplayed())
		{
			Reporter.log("The Apartment Address is displayed");
			Reporter.log("The Apartment Address value is:"+aptName);
		}else
		{
			Reporter.log("The Apartment Address is not displayed");
		}

		//City Address
		WebElement cityData = driver.findElement(By.name(cityAddNameLoc));
		cityData.sendKeys(cityName);
		//Validating the City address is displayed or not
		if(cityData.isDisplayed())
		{
			Reporter.log("The City Address is displayed");
			Reporter.log("The City Address Value is:"+cityName);
		}else
		{
			Reporter.log("The City Address is not displayed");
		}

		//State Address
		WebElement stateData = driver.findElement(By.name(stateAddNameLoc));
		stateData.sendKeys(stateName);
		//Validating the apartment address is displayed or not
		if(stateData.isDisplayed())
		{
			Reporter.log("The State Address is displayed");
			Reporter.log("The State Address Value is:"+stateName);
		}else
		{
			Reporter.log("The State Address is not displayed");
		}

		//Postal Address
		WebElement postalData = driver.findElement(By.id(postalAddIdLoc));
		postalData.sendKeys(postalCode);
		//Validating the apartment address is displayed or not
		if(postalData.isDisplayed())
		{
			Reporter.log("The Postal code is displayed");
			Reporter.log("The Postal code Value is:"+postalCode);
		}else
		{
			Reporter.log("The Postal code is not displayed");
		}
		//Country Address
		WebElement countryData = driver.findElement(By.xpath(countryXpathLoc));
		countryData.sendKeys(countryName);
		//Validating the apartment address is displayed or not
		if(countryData.isDisplayed())
		{
			Reporter.log("The Country Address is displayed");
			Reporter.log("The Country Value is:"+countryName);
		}else
		{
			Reporter.log("The Country Address is not displayed");
		}

		//Email
		WebElement emailData = driver.findElement(By.id(emailIDLoc));
		emailData.sendKeys(emailId);
		//Validating email Id is displayed or not
		if(emailData.isDisplayed())
		{
			Reporter.log("Email Id is displayed");
			Reporter.log("The Email Id value is:"+emailId);
		}else
		{
			Reporter.log("Email Id is not displayed");
		}

		//Date of Demo
		WebElement dateData = driver.findElement(By.name(dateNameLoc));
		dateData.sendKeys(dateOfDemo);
		//Validating the date is displayed or not
		if(dateData.isDisplayed())
		{
			Reporter.log("Date is displayed");
			Reporter.log("The date value is:"+dateOfDemo);
		}else
		{
			Reporter.log("Date is not displayed");
		}

		//Convenient Time
		//for hour
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementById('select2-vfb-16-hour-container').value='03'");	

		//Validating hour is displayed or not
		/*if(hourData.isDisplayed())
				{
					Reporter.log("Hour is displayed");
					Reporter.log("The Hour Value is:"+hhInput);
				}else
				{
					Reporter.log("Hour is not displayed");
				}*/
		//for minute
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("document.getElementById('select2-vfb-16-min-container').value='35'");

		/*//Validating hour is displayed or not
				if(hourData.isDisplayed())
				{
					Reporter.log("Minute is displayed");
					Reporter.log("The Minute Value is:"+mmInput);
				}else
				{
					Reporter.log("Minute is not displayed");
				}*/
		//Mobile Number
		WebElement mobData = driver.findElement(By.id(mobNoIdLoc));
		mobData.sendKeys(mobileNumber);
		//Validating Mobile Number is displayed or not
		if(mobData.isDisplayed())
		{
			Reporter.log("Mobile Number is displayed");
			Reporter.log("The Mobile Number is:"+mobileNumber);
		}else
		{
			Reporter.log("Mobile Number is not displayed");
		}

		//Click Which Course are you Interested
		WebElement course1Data = driver.findElement(By.id(course1IdLoc));
		WebElement course2Data = driver.findElement(By.id(course2IdLoc));
		course1Data.click();
		course2Data.click();
		//Validating Selenium WebDriver Button is clicked or not
		if(course1Data.isDisplayed())
		{
			Reporter.log("The Course1 is displayed");
			Reporter.log("The Course1 is:"+course1);
		}else
		{
			Reporter.log("The Course1 is not displayed");
		}
		//Validating TestNG Button is clicked or not
		if(course2Data.isDisplayed())
		{
			Reporter.log("The Course1 is displayed");
			Reporter.log("The Course1 is:"+course2);
		}else
		{
			Reporter.log("The Course1 is not displayed");
		}
		//Enter your query
		WebElement queryData = driver.findElement(By.id(queryIdLoc));
		queryData.sendKeys(enterYourQuery);
		//Validating Query is displayed or not
		if(queryData.isDisplayed())
		{
			Reporter.log("The Query is displayed");
			Reporter.log("The Query Value is:"+enterYourQuery);
		}else
		{
			Reporter.log("The Query is not displayed");
		}
		//Verification
		 driver.findElement(By.name(verificationNameLoc)).sendKeys("58");
		//Scanner class
		/*Scanner sc = new Scanner(System.in);
		Reporter.log("Enter Two digit no: ");
		int verificationNum = sc.nextInt();
		 verificationNum = verificationDigit.sendKeys("58");
		Reporter.log(verificationNum);*/
		//Submit Button
		WebElement subBtn = driver.findElement(By.name(submitNameLoc));
		//Validating click button is enabled
		if(subBtn.isEnabled())
		{
			Reporter.log("Submit Button is enabled");
			subBtn.click();
			Reporter.log("Submit Button is clicked");
		}
		//Thread.sleep(3000);


	}

	@Test(priority = 3)
	public void validatingSuccessfulMsg() {
		//Validating the successful Registration message
		WebElement regSuccessfulMsg = driver.findElement(By.xpath(regMsgXpath));
		String actRegMsg=regSuccessfulMsg.getText();
		String expRegMsg="Registration Form is Successfully Submitted. The Transaction ID : NXTGEN79397		";
		
		if(actRegMsg.equals(expRegMsg))
		{
			Reporter.log("Both the messages are same");
			Reporter.log("The acutual message is:"+actRegMsg);
		}else
		{
			Reporter.log("Both the messages are not same");
			Reporter.log("The acutual message is:"+expRegMsg);
		}

	}
}
