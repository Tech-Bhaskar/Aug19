package p9_Aug6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestLoginPage1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		//find element
		WebElement unTB=driver.findElement(By.id("username"));
		
		//Refresh the page
		driver.navigate().refresh();
		
		//enter the username perform the action
		unTB.sendKeys("admin");
		
		
		
	}

}
