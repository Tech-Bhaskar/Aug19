package com.webbrowserautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_009_1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcIMG=t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcIMG, new File("./img/logimage.png"));
		driver.close();
		
		
	}

}
