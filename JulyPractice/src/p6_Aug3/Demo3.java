package p6_Aug3;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	//close specific browser
	
	static {
	       System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	       System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
        }

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		
		Set<String> allWHS = driver.getWindowHandles();
		for (String whs:allWHS)
		{
			driver.switchTo().window(whs);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Tech Mahindra"))
			{
				driver.close();
				break;
			}
		}
		
		//driver.quit();

	}

}
