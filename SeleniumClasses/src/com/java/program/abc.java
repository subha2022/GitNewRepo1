package com.java.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


	
	class A12
	{
		public void display()
		{
			System.out.println("I am super class");
		}
	}
	class B12 extends A12
	{
		public void display()
		{
			System.out.println("I am A12  Super class in B12");
		}
		public void display1()
		{
			System.out.println("I am B12 Sub class of A12");
		}
	}
	class C12 extends A12
	{
		public void display()
		{
			System.out.println("I am Super class in C12");
		}
		public void display2()
		{
			System.out.println("I am C12 Sub class of A12");
		}
		
	}
	public class abc {
	
	public static void main(String[] args) throws Exception 
	{
		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		String url="https://netbanking.hdfcbank.com/netbanking/";
		String CID="123sgtd";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.className("inputfield ibvt loginData")).sendKeys(CID);
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTINUE")).click();*/
	A12 obj = new A12();
	obj.display();
	B12 obj1 = new B12();
	obj1.display();
	obj1.display1();
	C12 obj2=new C12();
	obj2.display();
	
	obj2.display2();
		
		
	}
				
}

