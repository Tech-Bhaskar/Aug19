package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_004_2
{
	//if the specifed locator is not matching with any element present in the page
	//then find element method will throw NosuchElementsException...this is for all locators
	// if the specifed element matches with multiple elementspresent in the page
	// then find element will return address of first matching elements.
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();		
		driver.get("file:///D:/sample2.html");
		//search the element
		WebElement element = driver.findElement(By.tagName("a"));		
		//click it
		element.click();

	}

}
