package p3_jul30;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		//enter google.com
		driver.get("D:\\Day10_july30\\ListBox2.html");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select=new Select(listBox);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("b");
		Thread.sleep(1000);
		select.selectByVisibleText("Snacks");
		select.deselectByIndex(0);
		Thread.sleep(1000);
		select.deselectByValue("b");
		Thread.sleep(1000);
		select.deselectByVisibleText("Snacks");
		System.out.println(select.isMultiple());
		driver.quit();
	}

}
