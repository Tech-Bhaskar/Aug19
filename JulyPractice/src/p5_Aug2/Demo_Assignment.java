package p5_Aug2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Assignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Day12_Aug2nd\\PopUpDemo.html");
		driver.findElement(By.id("A4")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bhanu");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bhanu");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[text()]")).click();
	}

}
