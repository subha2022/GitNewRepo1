package com.lunching;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003 extends BaseTest0
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		init();
		luncher("chromebrowser");
		navigateUrl("amazonurl");

		driver.manage().window().maximize(); //maximize the window
		
		String title = driver.getTitle(); //get title
		System.out.println(title);
		
		 String url = driver.getCurrentUrl(); //get current url
		System.out.println(url);
		
		driver.manage().deleteAllCookies(); // delete all cookies
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		//driver.close();//current window will close
		
		driver.quit();//all the  window will close
	}

}
