package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiSelect {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/webtable/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement programmingmultiSelect = driver.findElement(By.name("programming"));
		
		if(programmingmultiSelect.isDisplayed())
		{
			Select languages = new Select(programmingmultiSelect);
			Thread.sleep(3000);
			// select by visible text
			languages.selectByVisibleText("Java");
			languages.selectByVisibleText("Python");
			//select by value
			languages.selectByValue("JAVASCRIPT");
			//select by index
			languages.selectByIndex(4);
			//deselecting
			languages.deselectByVisibleText("Python");
			
		}else
		{
			System.out.println("Programming Knowledge drop down option is not displayed");
		}

	}

}
