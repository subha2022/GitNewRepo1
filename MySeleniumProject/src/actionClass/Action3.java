package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action3 {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //for in side frame

		Actions a= new Actions(driver);
		WebElement drag = driver.findElement(By.id("slider"));
		//a.dragAndDropBy(drag, 400, 0).perform();

		a.clickAndHold(drag).moveByOffset(200, 0).release(drag).build().perform();

		driver.switchTo().defaultContent();// for out side content

		//right click
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Droppable')]"));
		a.contextClick(element).perform();


		Thread.sleep(3000);
		driver.close();


	}

}
