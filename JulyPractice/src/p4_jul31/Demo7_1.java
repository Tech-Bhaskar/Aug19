package p4_jul31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7_1 {
	static {
	       System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	       System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
           }

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Day11_july31\\ActionDemo.html");
		driver.findElement(By.id("A4")).click();
		Thread.sleep(3000);
		String xp1="//h1[text()='Block 1']";
		WebElement block1 = driver.findElement(By.xpath(xp1));
		
		String xp3="//h1[text()='Block 3']";
		WebElement block3=driver.findElement(By.xpath(xp3));
		
		Actions actions=new Actions(driver);
		Duration d=Duration.ofSeconds(2);
		//composite actions to be analysed
		actions.clickAndHold(block1).pause(d).moveToElement(block3).pause(2).release().perform();
		
	}

}
