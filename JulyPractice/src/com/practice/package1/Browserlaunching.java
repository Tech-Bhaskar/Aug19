package com.practice.package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunching {
	static
{
	/*
	 * 2 arguments key and Value of string type, The path to the driver
	 * executable must be set by the webdriver.chrome.driver system property;
	 * for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver.
	 * The latest version can be downloaded from
	 * http://chromedriver.storage.googleapis.com/index.html
	 */	
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
}
	

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver;            //Reference variable
		driver=new ChromeDriver();//to open in chrome you have to call a class Chromedriver,Chromedriver() is a construture
		
//		driver. all 13 methods to be practiced
//		Thread.sleep(5000);
		
//		driver.close();

	}

}
