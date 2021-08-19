package com.webbrowserautomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003_1
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		//to open the webpage or url
		driver.get("https://www.google.com");
		
		//to get the current url
		String pagename = driver.getCurrentUrl();
		System.out.println(pagename);
		
		//to get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//to maximize tge window
		driver.manage().window().maximize();
		
		//to provide the delay
		Thread.sleep(5000);
				
		//to get the current size of the window
		Dimension currentsize = driver.manage().window().getSize();
		System.out.println(currentsize);
		
		//to resize the current window
		Dimension newsize= new Dimension(600,400);
		driver.manage().window().setSize(newsize);
		
		Thread.sleep(3000);
		
		//to get the current position of the window
		Point currentposition = driver.manage().window().getPosition();
		System.out.println(currentposition);
		
		//to move the browser to new position
		int x=200;
		for(int i=1;i<=10;i++)
		{
			Point newposition= new Point(x, 100);		
			driver.manage().window().setPosition(newposition);
			x=x+50;
			Thread.sleep(500);
		}		
		// No method to minimize the browser

	}

}
