package com.lunching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLunching {

public static WebDriver driver;
 
public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
//MyGlamm+Lipstick
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("MyGlamm+Lipstick");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//driver.findElement(By.xpath("(//span[@class='a-truncate-cut'][contains(text(),'Manish Malhotra Beauty…')])[1]")).click();
driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();
driver.quit();

}
}
