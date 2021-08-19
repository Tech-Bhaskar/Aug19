package p7_Aug4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
			
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		driver.get("https://demo.actitime.com/login.do");
		//System.out.println(driver.getTitle());//actiTIME Login
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//wait.until(ExpectedConditions.titleContains("Enter"));
		//System.out.println(driver.getTitle());//actiTIME Enter Time Track
		while(true)
		{
			try
			{
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch( Exception e)
			{
				e.printStackTrace();
				
			}
			}
		}
		
		
		//wait.until(ExpectedConditions.titleContains("Login"));
		//System.out.println(driver.getTitle());//actiTIME Login

	}

