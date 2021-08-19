package p4_jul31;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*we can use Select class only on the listbox (<select>) else we get UnexpectedTagNameException
 * Action is interface , Actions is a class
 * present in interactions package
 * new ChromeDriver();-----no arg con
 * new Actions(WebDriver);- 1arg con-WebDriver
 * new Select(WebElement); 1arg con-WebElement
 * When we call any method of Actions class we must call perform() at the end 
 */
public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Day11_july31\\ActionDemo.html");
		driver.findElement(By.id("A3")).click();
		Thread.sleep(1000);
		String xp="//input[@value='Double Click']";
		WebElement button = driver.findElement(By.xpath(xp));
		Actions actions=new Actions(driver);
		actions.doubleClick(button).perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
