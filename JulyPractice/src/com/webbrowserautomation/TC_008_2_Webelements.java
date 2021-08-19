package com.webbrowserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_008_2_Webelements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:/Demo1.html");
		WebElement element = driver.findElement(By.id("A1"));
		int x1 = element.getLocation().getX();
		System.out.println(x1);
		
		
		int x = driver.findElement(By.id("A1")).getLocation().getX();
		System.out.println(x);
		
		int y = driver.findElement(By.id("A1")).getLocation().getY();
		System.out.println(y);
		
		int h = driver.findElement(By.id("A1")).getSize().getHeight();
		System.out.println(h);
		
		int w = driver.findElement(By.id("A1")).getSize().getWidth();
		System.out.println(w);
		
		
		Rectangle r = driver.findElement(By.id("A1")).getRect();
		
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		driver.close();
		
		
		

	}

}
