package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_004_3
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();		
		driver.get("file:///D:/sample.html");
		
		//WebElement element = driver.findElement(By.tagName("a"));		
		
//        driver.findElement(By.tagName("a")).click();
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//		driver.findElement(By.id("d1")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//        Thread.sleep(1000);
//        driver.findElement(By.name("n1")).click();
//        Thread.sleep(1000);
//		driver.navigate().back();
//		driver.findElement(By.className("c1")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//        Thread.sleep(1000);
//        driver.findElement(By.linkText("Google")).click();
        
//        Thread.sleep(1000);
//		driver.navigate().back();
//        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("oo")).click();
        
        
        

	}

}
