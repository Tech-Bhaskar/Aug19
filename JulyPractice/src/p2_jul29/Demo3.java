package p2_jul29;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Demo.html");
		String xp="//input[@type='text']";
//		WebElement element = driver.findElement(By.xpath(xp));
//		element.sendKeys("bhanu");
		
		List<WebElement> allElements = driver.findElements(By.xpath(xp));
		//System.out.println(allElements.getClass().getName());
		String[] data= {"Akshara","Bhanu","Divya"};
		int count = allElements.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement e = allElements.get(i);
			e.sendKeys(data[i]);
		}
		
//		driver.close();
		
	}

}
