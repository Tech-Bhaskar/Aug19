package p6_Aug3;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Day13_Aug3rd\\sample1.html");
//		driver.switchTo().frame(0);//using index (int)//method overloading by count
		
//		driver.switchTo().frame("f1");//using id (String)//by name-- string
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='sample2.html']"));//it can be with locators
		driver.switchTo().frame(frameElement);//using address (WebElement)
		
		driver.findElement(By.id("t2")).sendKeys("prakash");
		
		Thread.sleep(5000);
//		driver.switchTo().defaultContent();//transfer the control back to parent browser
		driver.switchTo().parentFrame();//switch to parent browser
		driver.findElement(By.id("t1")).sendKeys("bhanu");
	}

}
