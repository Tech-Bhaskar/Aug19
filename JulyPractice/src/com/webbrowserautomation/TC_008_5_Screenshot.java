package com.webbrowserautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_008_5_Screenshot {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
	     WebElement errElement = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
	     
	     File scrFile = errElement.getScreenshotAs(OutputType.FILE);
	     
	     System.out.println(scrFile.getAbsolutePath());
	     
	     FileUtils.copyFile(scrFile, new File("./img/error.png"));
	     
	     driver.close();
	     
	     
	     
	     

	}

}
