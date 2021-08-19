package p3_jul30;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		//enter google.com
		driver.get("D:\\Day10_july30\\ListBox1.html");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.id("A1"));//point to list box by find element by Id locator
		Select select=new Select(listBox);//
		select.selectByIndex(1);
		Thread.sleep(1000);
		select.selectByValue("a");
		Thread.sleep(1000);
		select.selectByVisibleText("Rajahmundry");
		boolean v = select.isMultiple();
		System.out.println(v);
		//select.deselectByIndex(0);//" java.lang.UnsupportedOperationException: 
		//You may only deselect options of a multi-select
		
		
	}

}
