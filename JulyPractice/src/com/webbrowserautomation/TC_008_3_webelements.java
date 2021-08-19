package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_008_3_webelements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:/Demo1.html");
		WebElement element = driver.findElement(By.id("A2"));
		String tag = element.getTagName();
		System.out.println(tag);
		
		System.out.println(element.getAttribute("href"));
		
		System.out.println(element.getAttribute("id"));
				
		System.out.println(element.getText());
		
		driver.close();
		

	}

}
