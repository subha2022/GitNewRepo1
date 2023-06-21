package com.selenium.advance.program;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_Demo_Page 
{

	public static void main(String[] args) throws Exception
	{
		//Parameterized all input value
		String url ="https://nxtgenaiacademy.com/";
		String firstName = "Subhasmita";
		String lastName="Jena";
		String gender="Female";
		String streetAddress ="Chansandra";
		String aptName="Isha Mistry Green";
		String cityName="Bangalore";
		String stateName="Karnatak";
		String postalCode="560067";
		String countryName="India";
		String emailId="subhasmitadoll@gmail.com";
		String dateOfDemo="2/10/2023";
		String hhInput="05";
		String mmInput="10";
		String mobileNumber="7853860002";
		String course1="Selenium WebDriver";
		String course2="TestNG";
		String enterYourQuery="Which Topics are included in Selenium class.";
		String successfullMessageText="Registration form is successfully submited.";
		//Parameterized all webelement path
		String demoSitesLinkText="Demo Sites";
		String practiceAutomationLink="Practice Automation";
		String registrationDemoPageParLink="Registration Form";
		String regForDemoXpath="//h3[text()='Register For Demo']";
		String firstNameId="vfb-5";
		String lastNameNameLoc="vfb-7";
		String genderIdLoc="vfb-31-2";
		String streetAddNameLoc="vfb-13[address]";
		String aprtmentAddIdLoc="vfb-13-address-2";
		String cityAddNameLoc="vfb-13[city]";
		String stateAddNameLoc="vfb-13[state]";
		String postalAddIdLoc="vfb-13-zip";
		String countryXpathLoc="(//span[contains(@class,'select2-selection select2-selection--single')])[1]";
		String emailIDLoc="vfb-14";
		String dateNameLoc="vfb-18";
		String hhIdLoc="item-vfb-16";
		String mmIdLoc="item-vfb-16";
		String mobNoIdLoc="vfb-19";
		String course1IdLoc="vfb-20-0";
		String course2IdLoc="vfb-20-2";
		String queryIdLoc="vfb-23";
		String verificationNameLoc="vfb-3";
		String submitNameLoc="vfb-submit";
		String regMsgXpath="//div[contains(@class,'elementor-widget-container')]";


		//Set the system property for chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		//Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();

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
		WebElement regDemoPage = driver.findElement(By.partialLinkText(registrationDemoPageParLink));
		//Mouse Over action
		action.moveToElement(regDemoPage).click().perform();
		System.out.println("Register Demo Page is Clicked");
		//Validate the Register for Demo Message
		WebElement regForDemo = driver.findElement(By.xpath(regForDemoXpath));
		String actualMsg=regForDemo.getText();
		String expectedMsg="Register For Demo";
		if(actualMsg.equals(expectedMsg))
		{
			System.out.println("Both actual and expected messages are same");
			System.out.println("The actual message is:"+actualMsg);
		}else
		{
			System.out.println("Both actual and expected messages are not same");
			System.out.println("The actual message is:"+actualMsg);
			System.out.println("The expected message is :"+expectedMsg);
		}

		//Fill all the data in Registration form
		//First Name
		WebElement firstNamedata = driver.findElement(By.id(firstNameId));
		//Enter the value
		firstNamedata.sendKeys(firstName);
		//Validating first name is displayed or not
		if(firstNamedata.isDisplayed())
		{
			System.out.println("First Name is dispalyed");
			System.out.println("The First Name value is:"+firstName);
		}else
		{
			System.out.println("First Name is not dispalyed");
		}

		//last Name
		WebElement lastNamedata = driver.findElement(By.name(lastNameNameLoc));
		//Enter the value
		lastNamedata.sendKeys(lastName);
		//Validating first name is displayed or not
		if(lastNamedata.isDisplayed())
		{
			System.out.println("Last Name is dispalyed");
			System.out.println("The Last Name value is:"+lastName);
		}else
		{
			System.out.println("Last Name is not dispalyed");
		}
		//Female Radio Button
		WebElement femaleRadioBtn = driver.findElement(By.id(genderIdLoc));
		femaleRadioBtn.click();
		//Validating the Radio Button is selected or not
		if(femaleRadioBtn.isSelected())
		{
			System.out.println("Female Radio Button is selected");
		}else
		{
			System.out.println("Female Radio Button is not selected");
		}
		// Enter Address

		//Street Address
		WebElement StreetData = driver.findElement(By.name(streetAddNameLoc));
		StreetData.sendKeys(streetAddress);
		//Validating StreetAddress is displayed or not
		if(StreetData.isDisplayed())
		{
			System.out.println("The Street Address is displayed");
			System.out.println("The Street Address Value is:"+streetAddress);
		}else
		{
			System.out.println("The Street Address is not displayed");
		}
		//Apartment Address
		WebElement aptData = driver.findElement(By.id(aprtmentAddIdLoc));
		aptData.sendKeys(aptName);
		//Validating the apartment address is displayed or not
		if(aptData.isDisplayed())
		{
			System.out.println("The Apartment Address is displayed");
			System.out.println("The Apartment Address value is:"+aptName);
		}else
		{
			System.out.println("The Apartment Address is not displayed");
		}

		//City Address
		WebElement cityData = driver.findElement(By.name(cityAddNameLoc));
		cityData.sendKeys(cityName);
		//Validating the City address is displayed or not
		if(cityData.isDisplayed())
		{
			System.out.println("The City Address is displayed");
			System.out.println("The City Address Value is:"+cityName);
		}else
		{
			System.out.println("The City Address is not displayed");
		}

		//State Address
		WebElement stateData = driver.findElement(By.name(stateAddNameLoc));
		stateData.sendKeys(stateName);
		//Validating the apartment address is displayed or not
		if(stateData.isDisplayed())
		{
			System.out.println("The State Address is displayed");
			System.out.println("The State Address Value is:"+stateName);
		}else
		{
			System.out.println("The State Address is not displayed");
		}

		//Postal Address
		WebElement postalData = driver.findElement(By.id(postalAddIdLoc));
		postalData.sendKeys(postalCode);
		//Validating the apartment address is displayed or not
		if(postalData.isDisplayed())
		{
			System.out.println("The Postal code is displayed");
			System.out.println("The Postal code Value is:"+postalCode);
		}else
		{
			System.out.println("The Postal code is not displayed");
		}
		//Country Address
		WebElement countryData = driver.findElement(By.xpath(countryXpathLoc));
		countryData.sendKeys(countryName);
		//Validating the apartment address is displayed or not
		if(countryData.isDisplayed())
		{
			System.out.println("The Country Address is displayed");
			System.out.println("The Country Value is:"+countryName);
		}else
		{
			System.out.println("The Country Address is not displayed");
		}

		//Email
		WebElement emailData = driver.findElement(By.id(emailIDLoc));
		emailData.sendKeys(emailId);
		//Validating email Id is displayed or not
		if(emailData.isDisplayed())
		{
			System.out.println("Email Id is displayed");
			System.out.println("The Email Id value is:"+emailId);
		}else
		{
			System.out.println("Email Id is not displayed");
		}

		//Date of Demo
		WebElement dateData = driver.findElement(By.name(dateNameLoc));
		dateData.sendKeys(dateOfDemo);
		//Validating the date is displayed or not
		if(dateData.isDisplayed())
		{
			System.out.println("Date is displayed");
			System.out.println("The date value is:"+dateOfDemo);
		}else
		{
			System.out.println("Date is not displayed");
		}
		
		//Convenient Time
		//for hour
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementById('select2-vfb-16-hour-container').value='03'");	
		
		//Validating hour is displayed or not
		/*if(hourData.isDisplayed())
		{
			System.out.println("Hour is displayed");
			System.out.println("The Hour Value is:"+hhInput);
		}else
		{
			System.out.println("Hour is not displayed");
		}*/
		//for minute
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("document.getElementById('select2-vfb-16-min-container').value='35'");
		
		/*//Validating hour is displayed or not
		if(hourData.isDisplayed())
		{
			System.out.println("Minute is displayed");
			System.out.println("The Minute Value is:"+mmInput);
		}else
		{
			System.out.println("Minute is not displayed");
		}*/
		//Mobile Number
		WebElement mobData = driver.findElement(By.id(mobNoIdLoc));
		mobData.sendKeys(mobileNumber);
		//Validating Mobile Number is displayed or not
		if(mobData.isDisplayed())
		{
			System.out.println("Mobile Number is displayed");
			System.out.println("The Mobile Number is:"+mobileNumber);
		}else
		{
			System.out.println("Mobile Number is not displayed");
		}

		//Click Which Course are you Interested
		WebElement course1Data = driver.findElement(By.id(course1IdLoc));
		WebElement course2Data = driver.findElement(By.id(course2IdLoc));
		course1Data.click();
		course2Data.click();
		//Validating Selenium WebDriver Button is clicked or not
		if(course1Data.isDisplayed())
		{
			System.out.println("The Course1 is displayed");
			System.out.println("The Course1 is:"+course1);
		}else
		{
			System.out.println("The Course1 is not displayed");
		}
		//Validating TestNG Button is clicked or not
		if(course2Data.isDisplayed())
		{
			System.out.println("The Course1 is displayed");
			System.out.println("The Course1 is:"+course2);
		}else
		{
			System.out.println("The Course1 is not displayed");
		}
		//Enter your query
		WebElement queryData = driver.findElement(By.id(queryIdLoc));
		queryData.sendKeys(enterYourQuery);
		//Validating Query is displayed or not
		if(queryData.isDisplayed())
		{
			System.out.println("The Query is displayed");
			System.out.println("The Query Value is:"+enterYourQuery);
		}else
		{
			System.out.println("The Query is not displayed");
		}
		//Verification
		WebElement verificationDigit = driver.findElement(By.name(verificationNameLoc));
		//Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two digit no: ");
		int verificationNum = sc.nextInt();
		System.out.println(verificationNum);
		//Submit Button
		WebElement subBtn = driver.findElement(By.name(submitNameLoc));
		//Validating click button is enabled
		if(subBtn.isEnabled())
		{
			System.out.println("Submit Button is enabled");
			subBtn.click();
			System.out.println("Submit Button is clicked");
		}
		Thread.sleep(3000);
		//Validating the successful Registration message
		WebElement regSuccessfulMsg = driver.findElement(By.xpath(regMsgXpath));
		String actRegMsg=regSuccessfulMsg.getText();
		String expRegMsg="Registration Form is Successfully Submitted. The Transaction ID : NXTGEN54650";
		if(actRegMsg.equals(expRegMsg))
		{
			System.out.println("Both the messages are same");
			System.out.println("The acutual message is:"+actRegMsg);
		}else
		{
			System.out.println("Both the messages are not same");
			System.out.println("The acutual message is:"+expRegMsg);
		}
		//Close the application
		driver.close();
		System.out.println("Appliation is closed");

	}

}
