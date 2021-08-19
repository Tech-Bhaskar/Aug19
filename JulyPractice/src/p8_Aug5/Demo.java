package p8_Aug5;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	static {
	       System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	       System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
           }

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");//D:\\Day14_Aug4th\\PopUpDemo.html"
		Thread.sleep(2000);
		
		driver.quit();
		
	}
       
       
}
