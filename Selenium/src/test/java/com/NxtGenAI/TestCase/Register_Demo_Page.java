package com.NxtGenAI.TestCase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pack1.Excel_Utility_File;

public class Register_Demo_Page 
{
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public static void main(String[] args) throws Exception
	{
		String excelPath=".\\TestData\\RegisterDemoTestData.xlsx";
		String sheetName="RegisterUser";
		
		Excel_Utility_File excel = new Excel_Utility_File(excelPath, sheetName);

		int rowCount=excel.getRowCount();

		for(int row=1;row<rowCount;row++) {

			//Parameterized all input value
			String url =excel.getCellData(row, 0);
			String regFormTitle=excel.getCellData(row, 1);
			String firstName = excel.getCellData(row, 2);
			String lastName=excel.getCellData(row, 3);
			String gendervalue=excel.getCellData(row, 4);
			String streetAddress =excel.getCellData(row, 5);
			String aptName=excel.getCellData(row, 6);
			String cityName=excel.getCellData(row, 7);
			String stateName=excel.getCellData(row, 8);
			String postalCode=excel.getCellData(row, 9);
			String countryName=excel.getCellData(row, 10);
			String emailId=excel.getCellData(row,11);
			String dateOfDemo=excel.getCellData(row, 12);
			String hhInput=excel.getCellData(row, 13);
			String mmInput=excel.getCellData(row, 14);
			String mobileNumber=excel.getCellData(row, 15);
			String seleniumWebDriverValue=excel.getCellData(row, 16);
			String uftValue=excel.getCellData(row, 17);
			String testNGValue=excel.getCellData(row, 18);
			String coreJavaValue=excel.getCellData(row, 19);
			String functionalTestingValue=excel.getCellData(row, 20);
			String othersValue=excel.getCellData(row, 21);
			/*String course1="Selenium WebDriver";
			String course2="UFT";
			String course3="TestNG";
			String course4="Core Java";
			String course5="Fuctional Testing";
			String course6="Others";*/
			String enterYourQuery=excel.getCellData(row, 22);
			String successfullMessageText=excel.getCellData(row, 23);

			//Parameterized all webelement path
			String demoSitesLinkText="Demo Sites";
			String practiceAutomationLink="Practice Automation";
			String registrationDemoPageParLink="Registration Form";
			String regForDemoXpath="//h3[text()='Register For Demo']";
			String firstNameId="vfb-5";
			String lastNameNameLoc="vfb-7";
			String mgenderIdLoc="vfb-31-1";
			String fgenderIdLoc="vfb-31-2";
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
			String course2IDLoc="vfb-20-1";
			String course3IdLoc="vfb-20-2";
			String course4IDLoc="vfb-20-3";
			String course5IDLoc="vfb-20-4";
			String course6TDLoc="vfb-20-5";
			String queryIdLoc="vfb-23";
			String verificationNameLoc="vfb-3";
			String submitNameLoc="vfb-submit";
			String regMsgXpath="//div[contains(@class,'elementor-widget-container')]";


			//Set the system property for chrome browser
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
			//Create object instance for chrome driver
			ChromeDriver driver = new ChromeDriver();
			
			//Wait Statement
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
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

			//Gender Radio Button
			WebElement maleRadioBtn = driver.findElement(By.id(mgenderIdLoc));
			WebElement femaleRadioBtn = driver.findElement(By.id(fgenderIdLoc));
			if(maleRadioBtn.isEnabled() && gendervalue.equalsIgnoreCase("Female"))
			{
				System.out.println("Female Radio Button is Displayed");
				femaleRadioBtn.click();
				System.out.println("Female Radio Button is Selected");
			}
			else if(femaleRadioBtn.isEnabled() && gendervalue.equalsIgnoreCase("Male")) 
			{
				System.out.println("Male Radio Button is Displayed");
				femaleRadioBtn.click();
				System.out.println("Male Radio Button is Selected");
			}
			/*//Validating the Radio Button is selected or not
		if(femaleRadioBtn.isSelected())
		{
			System.out.println("Female Radio Button is selected");
		}else
		{
			System.out.println("Female Radio Button is not selected");
		}*/
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
			WebElement seleniumWebDriverChkBx = driver.findElement(By.id(course1IdLoc)) ;
			WebElement uftchkbx = driver.findElement(By.id(course2IDLoc));
			WebElement testNGchkbx =driver.findElement(By.id(course3IdLoc));
			WebElement coreJavaChkbx  = driver.findElement(By.id(course4IDLoc));
			WebElement functionalTestingChkBx= driver.findElement(By.id(course5IDLoc));
			WebElement othersChkBx = driver.findElement(By.id(course6TDLoc));

			//Selenium WebDriver Check Box
			if(seleniumWebDriverChkBx.isEnabled()) {
				System.out.println("Selenium WebDriver Check Box is Enabled");
				if(seleniumWebDriverChkBx.isSelected()&& seleniumWebDriverValue.equalsIgnoreCase("OFF"))
					System.out.println("Selenium WebDriver Check Box is Unselected");
				seleniumWebDriverChkBx.click();
			}else if(seleniumWebDriverValue.equalsIgnoreCase("ON"))
			{
				seleniumWebDriverChkBx.click();
				System.out.println("Selenium WebDriver Check Box is Selected");
			}
			//UFT Check Box
			if(uftchkbx.isEnabled()) {
				System.out.println("UFT Check Box is Enabled");
				if(uftchkbx.isSelected()&& uftValue.equalsIgnoreCase("OFF"))
					System.out.println("UFT Check Box is Unselected");
				uftchkbx.click();
			}else if(uftValue.equalsIgnoreCase("ON"))
			{
				uftchkbx.click();
				System.out.println("UFT Check Box is Selected");
			}
			//TestNG Check Box
			if(testNGchkbx.isEnabled()) {
				System.out.println("TestNG Check Box is Enabled");
				if(testNGchkbx.isSelected()&& testNGValue.equalsIgnoreCase("OFF"))
					System.out.println("TestNG Check Box is Unselected");
				testNGchkbx.click();
			}else if(testNGValue.equalsIgnoreCase("ON"))
			{
				testNGchkbx.click();
				System.out.println("TestNG Check Box is Selected");
			}
			//CoreJava Check Box
			if(coreJavaChkbx.isEnabled()) {
				System.out.println("Core Java Check Box is Enabled");
				if(coreJavaChkbx.isSelected()&& coreJavaValue.equalsIgnoreCase("OFF"))
					System.out.println("Core Java Check Box is Unselected");
				coreJavaChkbx.click();
			}else if(coreJavaValue.equalsIgnoreCase("ON"))
			{
				coreJavaChkbx.click();
				System.out.println("Core Java Check Box is Selected");
			}
			//Functional Testing Check Box
			if(functionalTestingChkBx.isEnabled()) {
				System.out.println("Functional Testing Check Box is Enabled");
				if(functionalTestingChkBx.isSelected()&& functionalTestingValue.equalsIgnoreCase("OFF"))
					System.out.println("Functional Testing Check Box is Unselected");
				functionalTestingChkBx.click();
			}else if(functionalTestingValue.equalsIgnoreCase("ON"))
			{
				functionalTestingChkBx.click();
				System.out.println("Functional Testing Check Box is Selected");
			}
			//Others Check Box
			if(othersChkBx.isEnabled()) {
				System.out.println("Others Check Box is Enabled");
				if(othersChkBx.isSelected()&& othersValue.equalsIgnoreCase("OFF"))
					System.out.println("Others Check Box is Unselected");
				othersChkBx.click();
			}else if(othersValue.equalsIgnoreCase("ON"))
			{
				othersChkBx.click();
				System.out.println("Others Check Box is Selected");
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
			//Verification/Enter Two Digit
			WebElement verificationDigit = driver.findElement(By.name(verificationNameLoc));
			if(verificationDigit.isDisplayed())
			{
				System.out.println("Enter any Two Digit No. is Displayed");
			}
			else {
				System.out.println("Enter any two Digit No. is not Displayed");
			}
			//Verify enter two digit no is enabled or not
			if(verificationDigit.isEnabled()) {
				System.out.println("Enter any Two Digit No. is Enabled");
				//Retrieve the Verification Number during the value
				String text = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label")).getText();
				String num[]=text.split(":");
				verificationDigit.sendKeys(num[1].trim());
				System.out.println("Enter Two Digit No.is "+num[1]);
			}else {
				System.out.println("Enter Two Digit No. is Enabled");
			}
			/*//Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two digit no: ");
		int verificationNum = sc.nextInt();
		System.out.println(verificationNum);*/

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

			//Retrieve Transaction number from the output
			String arrMsg[] =actRegMsg.split(":");
			String trnNum=arrMsg[1].trim();

			boolean status = false;
			if(actRegMsg.contains(expRegMsg))
			{
				System.out.println("The Successful Message Text is:"+actRegMsg);
				System.out.println("The Transaction Number is:"+trnNum);
				status=true;
			}else
			{
				System.out.println("Both the Messages are not same");
				System.out.println("The Acutual Message is:"+actRegMsg);
				System.out.println("The Expected Message is :"+expRegMsg);
			}
			//Close the application
			driver.close();
			System.out.println("Appliation is closed");
			
			
			
		}
	}

}
