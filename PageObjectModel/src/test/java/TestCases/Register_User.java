package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Pages.Registration_Demo_Page;

public class Register_User {

	public WebDriver driver;

	@Test(priority=1)
	public void lunchApplication()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver3.exe");
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url="https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		Reporter.log("Application is Lunched");

	}
	@Test(priority=2)
	public void registerUser()
	{
		Registration_Demo_Page rd= new Registration_Demo_Page(driver);
		rd.setFirstName("Subhasmita");
		rd.setLastName("Jena");
		rd.selectGender();
		rd.setStreetAddress("Chansandara");
		rd.setApartAdd("Isha Misty Green");
		rd.setCityAdd("Bangalore");
		rd.setCountryName("India");
		rd.setPostalAdd("560067");
		rd.setStateAdd("Karnataka");
		rd.setEmail("subhasmitadoll@gmail.com");
		rd.setDOB("02/05/1994");
		rd.setHH("05");
		rd.setMm("45");
		rd.setMobNo("7853860002");
		rd.selectCourse();
		rd.setQuery("I choose TestNg and Functional Testing");
		rd.setVerificationNum("45");
		rd.clickSubmitBtn();
		Reporter.log("User is Registered");
	}
	@Test(priority=3, alwaysRun=true)
	public void closeApplication()
	{
		driver.close();
		Reporter.log("Application is Closed");
	}


}
