package p9a_PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("admin");
		loginPage.setPassword("mnager");
		loginPage.clickLogin();
		Thread.sleep(1000);
		loginPage.verifyErrDispalyed();
		Thread.sleep(1000);
		loginPage.setUserName("admin");
		loginPage.setPassword("manager");
		loginPage.clickLogin();
		Thread.sleep(1000);
		loginPage.verifyErrDispalyed();
	}
}
