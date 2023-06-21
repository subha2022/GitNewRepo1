package com.seleniumAdvanced;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterForDemo {

	public static void main(String[] args) throws Throwable
	{
		//Parameterized all input value
		String url ="https://nxtgenaiacademy.com/";
		String firstName="Subhasmita";
		String lastName="jena";
		String streetAddress ="Chansandra";
		String aptName="Isha Mistry Green";
		String cityName="Bangalore";
		String stateName="Karnatak";
		String postalCode="560067";
		String countryName="India";
		String emailId="subhasmitadoll@gmail.com";
		String dateOfDemo="10/15/2022";
		String hourInput="08";
		String mintInput="36";
		String ampmInput="am";
		String mobileNumber="7853860002";
		String course="Selenium WebDriver";
		String enterYourQuery="Which Topics are included in Selenium class.";
		String successfullMessageText="Registration form is successfully submited.";

		//Parameterized all webelement path

		String qaAutomationLocator ="//span[contains(text(),'QA Automation')]";
		String registraionText="//*[@id=\"item-vfb-1\"]/div";
		String parcticeAutomationLocator="//span[contains(text(),'Practice Automation')]";
		String demoSiteForRegistraionFormLocator="//span[contains(text(),'Registration Form')]";
		String firstNameLocator="vfb-5";
		String lastNameLocator="vfb-7";
		String femaleRadioButtonLocator="//label[text()='Female']";
		String strAddressname="vfb-13[address]";
		String aptAddressid="vfb-13-address-2";
		String cityNameloc="vfb-13[city]";
		String stateLocator="vfb-13-state";
		String postalnameLocator="vfb-13[zip]";
		String countryIdloc="vfb-13-country";
		String emailnameloc="vfb-14";
		String dateidloc="vfb-18";
		String hourNameLoc="vfb-16[hour]";
		String minIdLoc="vfb-16-min";
		String mobNameLoc="vfb-19";
		String courseNameLoc="vfb-20[]";
		String queryIdLoc="vfb-23";
		String verificationIdLoc="vfb-3";
		String submitBtnNameLoc="vfb-submit";
		String successMsgxpath="//*[@id=\"content\"]/article/div/div/section[1]/div/div[1]/div/div/div/div";




		//Lunch the Application 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Application is lunched");

		//Create Actions class object instance
		Actions actClass=new Actions(driver);
		//click on QA Automation
		WebElement qaAutomation=driver.findElement(By.xpath(qaAutomationLocator));
		//Mouse over action
		actClass.moveToElement(qaAutomation).build().perform();
		//Click on Practice Automation
		WebElement pacticeAutomatio = driver.findElement(By.xpath(parcticeAutomationLocator));
		actClass.moveToElement(pacticeAutomatio).build().perform();
		//Click on Registration Form
		driver.findElement(By.xpath(demoSiteForRegistraionFormLocator)).click();
		System.out.println("Registraion From is Dispalyed");

		// Validate the title of the form is displayed as:Register For Demo
		WebElement registraionDemoText = driver.findElement(By.xpath(registraionText));

		if(registraionDemoText.isDisplayed())
		{
			System.out.println("Registration Text is displayed ");
		}else
		{
			System.out.println("Registration Text is not displayed");
		}
		//Validating the text
		String actResult= registraionDemoText.getText();
		String expResult="Register For Demo";
		if(actResult.equals(expResult))
		{
			System.out.println("Both Results are same");
			System.out.println("The actual result is:"+actResult);
		}else
		{
			System.out.println("Both the results are not same");
			System.out.println("The actual result is:"+actResult);
			System.out.println("The actual result is:"+expResult);
		}

		//Fill all the data in Registration form
		//First Name
		WebElement firstNamedata = driver.findElement(By.id(firstNameLocator));
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

		//Last Name
		WebElement lastNameData = driver.findElement(By.id(lastNameLocator));
		lastNameData.sendKeys(lastName);
		//Validating Last name is displayed or not
		if(lastNameData.isDisplayed())
		{
			System.out.println("Last Name is dispalyed");
			System.out.println("The Last Name value is:"+lastName);
		}else
		{
			System.out.println("Last Name is not dispalyed");
		}

		WebElement femaleRadioBtn = driver.findElement(By.xpath(femaleRadioButtonLocator));
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
		WebElement StreetData = driver.findElement(By.name(strAddressname));
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
		WebElement aptData = driver.findElement(By.id(aptAddressid));
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
		WebElement cityData = driver.findElement(By.name(cityNameloc));
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
		WebElement stateData = driver.findElement(By.id(stateLocator));
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
		WebElement postalData = driver.findElement(By.name(postalnameLocator));
		postalData.sendKeys(postalCode);
		//Validating the apartment address is displayed or not
		if(postalData.isDisplayed())
		{
			System.out.println("The Postal code is displayed");
			System.out.println("The Postal code Vale is:"+postalCode);
		}else
		{
			System.out.println("The Postal code is not displayed");
		}

		//Country Address
		WebElement countryData = driver.findElement(By.id(countryIdloc));
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
		WebElement emailData = driver.findElement(By.name(emailnameloc));
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
		WebElement dateData = driver.findElement(By.id(dateidloc));
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
		WebElement hourData = driver.findElement(By.name(hourNameLoc));
		hourData.sendKeys(hourInput);
		//Validating hour is displayed or not
		if(hourData.isDisplayed())
		{
			System.out.println("Hour is displayed");
			System.out.println("The Hour Value is:"+hourInput);
		}else
		{
			System.out.println("Hour is not displayed");
		}

		//for minute
		WebElement minData = driver.findElement(By.id(minIdLoc));
		minData.sendKeys(mintInput);
		//Validating hour is displayed or not
		if(hourData.isDisplayed())
		{
			System.out.println("Minute is displayed");
			System.out.println("The Minute Value is:"+mintInput);
		}else
		{
			System.out.println("Minute is not displayed");
		}

		//Mobile Number
		WebElement mobData = driver.findElement(By.name(mobNameLoc));
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
		WebElement courseData = driver.findElement(By.name(courseNameLoc));
		courseData.sendKeys(course);
		//Validating Selenium Button is clicked or not
		if(courseData.isDisplayed())
		{
			System.out.println("The Course is displayed");
			System.out.println("The Course is:"+course);
		}else
		{
			System.out.println("The Course is not displayed");
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
		WebElement VerificationDigit = driver.findElement(By.id(verificationIdLoc));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a two digit number:");
		int VerificationCode=sc.nextInt();
		System.out.println(VerificationCode);
		
		//Submit Button
		WebElement subBtn = driver.findElement(By.name(submitBtnNameLoc));
		 //Validating click button is enabled
		if(subBtn.isEnabled())
		{
			System.out.println("Submit Button is enabled");
			subBtn.click();
			System.out.println("Submit Button is clicked");
		}
		Thread.sleep(3000);
		
		//verify the successful Message is displayed or not
		WebElement successMsgText = driver.findElement(By.xpath(successMsgxpath));
		if(successMsgText.isDisplayed())
		{
			System.out.println("Successful Message is displayed");
			System.out.println("The successful message is:"+successfullMessageText);
		}else
		{
			System.out.println("Successful Message is not displayed");
		}
		Thread.sleep(3000);
		//Validating the Message 
		String actsuccessMsg=successMsgText.getText();
		String expSuccessMsg="Registration Form is Successfully Submitted. The Transaction ID : NXTGEN1937465";
		//Validating successful message
		if(actsuccessMsg.endsWith(expSuccessMsg))
		{
			System.out.println("Both the Messages are same");
			System.out.println("The actual successful message is:"+actsuccessMsg);
		}else
		{
			System.out.println("Both the Messages are not same");
			System.out.println("The actual successful message is:"+actsuccessMsg);
			System.out.println("The actual successful message is:"+expSuccessMsg);
		}
		//close the application
		driver.close();
		System.out.println("The Program is executed successfully");
		
	}

}
