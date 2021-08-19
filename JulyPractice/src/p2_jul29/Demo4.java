package p2_jul29;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Demo.html");
		List<WebElement> allElements = driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement element:allElements)
		{
			element.sendKeys("bhanu");
		}
		
		
	}

}
