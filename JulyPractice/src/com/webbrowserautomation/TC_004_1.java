package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_004_1
{
	//In Selenium Any thing present on web page is called as --Webelement
	//we perform action web element such as select,click,scrool etc..
	//before performing any action we should search the elementusing ---findElement method in webdriver
	//While Searching we have to specify how to identfy the element by using ---Locators
	//in Selenium we have 8 locators all are present in By class.
	//All are static methods.
	// as per performance renumbersed: 1-tag,2-id,3-name,4 ClassName,5Link text
	//6-Partial Link,7--Css Selection,8--Xpath
	
	//if the specifed locator is not matching with any element present in the page
	//then find element method will throw NosuchElementsException...this is for all locators
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();		
		driver.get("file:///D:/sample.html");
		//search the element
		WebElement element = driver.findElement(By.tagName("a"));		
		//click it
		element.click();

	}

}
