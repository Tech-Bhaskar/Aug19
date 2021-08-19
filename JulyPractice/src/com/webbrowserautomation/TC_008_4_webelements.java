package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class TC_008_4_webelements {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		WebElement errElement = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		
		String colorValue = errElement.getCssValue("color");//rgbaformat
		String colorInHexa = Color.fromString(colorValue).asHex();
		System.out.println(colorInHexa);//#ce0100
		if(colorInHexa.equals("#ce0100"))
		{
			System.out.println("pass:Text Color is Red");
		}
		else
		{		
			System.out.println("fail");
		}
		driver.close();				

	}

}
