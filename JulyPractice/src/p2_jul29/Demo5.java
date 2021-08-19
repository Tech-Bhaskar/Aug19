package p2_jul29;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> allElements = driver.findElements(By.xpath("//a"));
		System.out.println(allElements.size());
//		for(WebElement element:allElements)
//		{
//			element.sendKeys("bhanu");
//		}
//		
		
	}

}
