package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_004_4
{
	//Login question for interview
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		//open the browser
		WebDriver driver= new ChromeDriver();	
		//enter the URL
		driver.get("https://demo.actitime.com/login.do");
		//enter the user name
		driver.findElement(By.id("username")).sendKeys("admin");
		//Enter The password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Click on login button
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.id("logoutLink")).click();
		
		Thread.sleep(4000);
		
		driver.close();
	     

	}

}
