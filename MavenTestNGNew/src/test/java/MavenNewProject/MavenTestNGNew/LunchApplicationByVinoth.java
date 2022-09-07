package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.beans.property.SetProperty;

public class LunchApplicationByVinoth 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pabitra\\git\\GitNewRepo1\\MavenTestNGNew\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		String firstName="Subhasmita";
		String lastName="Jena";
		String streetAddress="Chansandra";
		String apartmentNo="3G15";
	
		driver.findElement(By.id("vfb-5")).sendKeys(firstName);
		driver.findElement(By.id("vfb-7")).sendKeys(lastName);
		//driver.findElement(By.name("vfb-8-2")).sendKeys("female");
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys(streetAddress);
		driver.findElement(By.id("vfb-13-city")).sendKeys(apartmentNo);
		
		//driver.findElement(By.linkText("HOME")).click();
		
		
	} 
	

}
