package p5_Aug2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	static {
	       System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	       System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
           }

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Day12_Aug2nd\\PopUpDemo.html");
		driver.findElement(By.id("A1")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();//click on ok
		//alert.dismiss();//click on cancel
		

		
	}

}
