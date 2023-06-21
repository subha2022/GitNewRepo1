package com.NxtgenAI.Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class Registration_Demo_Page {

	WebDriver driver;

	//Initialize the web locator values using By Class

	@FindBy(id="vfb-5") WebElement firstName;
	@CacheLookup
	@FindBy(name="vfb-7") WebElement lastName;
	@CacheLookup
	@FindBy(xpath="//input[@value=\"Female\"]") WebElement gender;
	@CacheLookup
	@FindBy(how=How.ID,using = "vfb-13-address") WebElement streetAddress; //we can  also do like this
	@CacheLookup
	@FindBy(name="vfb-13[address-2]") WebElement AppartAdd;
	@CacheLookup
	@FindBy(id="vfb-13-city") WebElement cityName;
	@CacheLookup
	@FindBy(xpath="//input[@name=\"vfb-13[state]\"]") WebElement stateName;
	@CacheLookup
	@FindBy(name="vfb-13[zip]") WebElement postalCode;
	@CacheLookup
	@FindBy(xpath="(//span[contains(@class,'select2-selection select2-selection--single')])[1]") WebElement countyName;
	@CacheLookup
	@FindBy(name="vfb-14") WebElement email;
	@CacheLookup
	@FindBy(id="vfb-14") WebElement dob;
	@CacheLookup
	@FindBy(id="select2-vfb-16-hour-container") WebElement timeHH;
	@CacheLookup
	@FindBy(id="select2-vfb-16-min-container") WebElement timeMM;
	@CacheLookup
	@FindBy(name="vfb-19") WebElement mobNo;
	@CacheLookup
	@FindBy(xpath="//input[@value=\"TestNG\"]") WebElement course1;
	@CacheLookup
	@FindBy(xpath="//input[@value=\"Functional Testing\"]") WebElement course2;
	@CacheLookup
	@FindBy(id="vfb-23") WebElement query;
	@CacheLookup
	@FindBy(name="vfb-3") WebElement verification;
	@CacheLookup
	@FindBy(xpath="//input[@value=\"Submit\"]") WebElement sbmtButton;
	

	//Constructor
	public Registration_Demo_Page(WebDriver driver)
	{
		this.driver = driver;
	}

	public void setFirstName(String fName)
	{
		//driver.findElement(firstName).sendKeys(fName);
		firstName.sendKeys(fName);
		Reporter.log("First Name is:"+fName);
	}

	public void setLastName(String lName)
	{
		lastName.sendKeys(lName);
		Reporter.log("Last Name is:"+lName);
	}

	public void selectGender()
	{
		gender.click();
		Reporter.log("Female Radio Button is Slected");
	}

	public void setStreetAddress(String sAddress)
	{
		streetAddress.sendKeys(sAddress);
		Reporter.log("Street Address is:"+sAddress);
	}

	public void setApartAdd(String AptAdd)
	{
		AppartAdd.sendKeys(AptAdd);
		Reporter.log("Appartment address is:"+AptAdd);
	}

	public void setCityAdd(String cAdd)
	{
		cityName.sendKeys(cAdd);
		Reporter.log("City Name is:"+cAdd);
	}

	public void setStateAdd(String sAdd) 
	{
		stateName.sendKeys(sAdd);
		Reporter.log("State Address is:"+sAdd);
	}

	public void setPostalAdd(String pAdd)
	{
		postalCode.sendKeys(pAdd);
		Reporter.log("Postal Code is:"+pAdd);
	}

	public void setCountryName(String cName)
	{
		countyName.sendKeys(cName);
		Reporter.log("Country Name is:"+cName);
	}

	public void setEmail(String sEmail)
	{
		email.sendKeys(sEmail);
		Reporter.log("Email is:"+sEmail);
	}

	public void setDOB(String sdob)
	{
		dob.sendKeys(sdob);
		Reporter.log("Date of Birth is:"+sdob);
	}

	public void setHH(String hh)
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementById('select2-vfb-16-hour-container').value='03'");	
		Reporter.log("Hour is:"+hh);
	}

	public void setMm(String mm)
	{
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("document.getElementById('select2-vfb-16-min-container').value='35'");
		Reporter.log("Hour is:"+mm);
	}

	public void setMobNo(String sMobNo)
	{
		mobNo.sendKeys(sMobNo);
		Reporter.log("Mobile no is:"+sMobNo);
	}

	public void selectCourse()
	{
		course1.click();
		/*WebElement c1 = driver.findElement(course1);
		c1.click();*/
		Reporter.log("First Course is selected");
		course2.click();
		Reporter.log("Second Course is selected");
	}

	public void setQuery(String sQuery)
	{
		query.sendKeys(sQuery);
		Reporter.log("Query is:"+sQuery);
	}

	public void setVerificationNum(String vNum)
	{
		verification.sendKeys(vNum);
		Reporter.log("Verification Number is:"+vNum);
	}

	public void clickSubmitBtn()
	{
		sbmtButton.click();
		Reporter.log("Submit Button is Clicked");
	}




}
