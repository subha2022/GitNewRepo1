package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Registration_Demo_Page {
	
	WebDriver driver;
	
	//Initialize the web locator values using By Class
	
	By firstName = By.id("vfb-5");
	By lastName = By.name("vfb-7");
	By gender = By.xpath("//input[@value=\"Female\"]");
	By streetAddress = By.id("vfb-13-address");
	By AppartAdd = By.name("vfb-13[address-2]");
	By cityName =By.id("vfb-13-city");
	By stateName = By.id("vfb-13-state");
	By postalCode = By.name("vfb-13[zip]");
	By countyName = By.xpath("(//span[contains(@class,'select2-selection select2-selection--single')])[1]");
	By email = By.name("vfb-14");
	By dob = By.id("vfb-18");
	By timeHH = By.id("select2-vfb-16-hour-container");
	By timeMM = By.id("select2-vfb-16-min-container");
	By mobNo = By.name("vfb-19");
	By course1 = By.xpath("//input[@value=\"TestNG\"]");
	By course2 = By.xpath("//input[@value=\"Functional Testing\"]");
	By query = By.id("vfb-23");
	By verification = By.name("vfb-3");
	By sbmtButton =By.xpath("//input[@value=\"Submit\"]");
	
	//Constructor
	public Registration_Demo_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setFirstName(String fName)
	{
		driver.findElement(firstName).sendKeys(fName);
		Reporter.log("First Name is:"+fName);
		Reporter.log(fName);
	}
	
	public void setLastName(String lName)
	{
		driver.findElement(lastName).sendKeys(lName);
		Reporter.log("Last Name is:"+lName);
	}
	
	public void selectGender()
	{
		driver.findElement(gender).click();
		Reporter.log("Female Radio Button is Slected");
	}
	
	public void setStreetAddress(String sAddress)
	{
		driver.findElement(streetAddress).sendKeys(sAddress);
		Reporter.log("Street Address is:"+sAddress);
	}
	
	public void setApartAdd(String AptAdd)
	{
		driver.findElement(AppartAdd).sendKeys(AptAdd);
		Reporter.log("Appartment address is:"+AptAdd);
	}
	
	public void setCityAdd(String cAdd)
	{
		driver.findElement(cityName).sendKeys(cAdd);
		Reporter.log("City Name is:"+cAdd);
	}
	
	public void setStateAdd(String sAdd)
	{
		driver.findElement(stateName).sendKeys(sAdd);
		Reporter.log("State Address is:"+sAdd);
	}
	
	public void setPostalAdd(String pAdd)
	{
		driver.findElement(postalCode).sendKeys(pAdd);
		Reporter.log("Postal Code is:"+pAdd);
	}
	
	public void setCountryName(String cName)
	{
		driver.findElement(countyName).sendKeys(cName);
		Reporter.log("Country Name is:"+cName);
	}
	
	public void setEmail(String sEmail)
	{
		driver.findElement(email).sendKeys(sEmail);
		Reporter.log("Email is:"+sEmail);
	}
	
	public void setDOB(String sdob)
	{
		driver.findElement(dob).sendKeys(sdob);
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
		driver.findElement(mobNo).sendKeys(sMobNo);
		Reporter.log("Mobile no is:"+sMobNo);
	}
	
	public void selectCourse()
	{
		WebElement c1 = driver.findElement(course1);
		c1.click();
		Reporter.log("First Course is selected");
		WebElement c2 = driver.findElement(course2);
		c2.click();
		Reporter.log("Second Course is selected");
	}
	
	public void setQuery(String sQuery)
	{
		driver.findElement(query).sendKeys(sQuery);
		Reporter.log("Query is:"+sQuery);
	}
	
	public void setVerificationNum(String vNum)
	{
		driver.findElement(verification).sendKeys(vNum);
		Reporter.log("Verification Number is:"+vNum);
	}
	
	public void clickSubmitBtn()
	{
		driver.findElement(sbmtButton).click();
		Reporter.log("Submit Button is Clicked");
	}
	
	
	

}
 