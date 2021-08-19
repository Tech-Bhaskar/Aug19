package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_005_1
{
	//CSS--Cascading Style Sheet-- It realted to presentation,
	//developer search an elemnt for webpage development
	//using CSS selectors-- perform login to demo.acttitime.com , use user name and password andd press 
	//login , the page should log in
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
    		//driver.findElement(By.id("username")).sendKeys("admin");
    		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
    		//Enter The password
    		//driver.findElement(By.name("pwd")).sendKeys("manager");
    		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
    		//Click on login button
    		//driver.findElement(By.id("loginButton")).click();
    		driver.findElement(By.className("#loginButton.initial")).click();// not working
    		
    		//Thread.sleep(9000);
    		
    		//driver.findElement(By.id("logoutLink")).click();
    		
    		Thread.sleep(4000);
    		
    		driver.close();
        }
}
