package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_008_1_webelements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:/Demo1.html");
		WebElement element = driver.findElement(By.id("A1"));
		Thread.sleep(1000);
		
		element.sendKeys("prakash");
		Thread.sleep(1000);
		driver.findElement(By.id("A2")).click();
		Thread.sleep(1000);
		
		boolean v1 = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(v1);
		boolean e1 = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(e1);
		
		boolean s1 = driver.findElement(By.id("A5")).isSelected();
		System.out.println(s1);
		
		driver.findElement(By.id("A6")).click();
		
		driver.findElement(By.id("A7")).click();
		
		driver.findElement(By.id("A8")).submit();
		 
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}
