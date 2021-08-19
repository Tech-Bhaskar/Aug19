package p9a_POM_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Test class
public class TestLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l=new LoginPage(driver);
		//First case
		l.setUN("abcde");
		l.setPW("abcde");
		l.clickBTN();
		l.Invalid();
		//Second Case
		driver.navigate().refresh();
		l.setUN("admin");
		l.setPW("manager");
		l.clickBTN();
		//Thread.sleep(5000);
		l.Invalid();
		
		
	}
}
