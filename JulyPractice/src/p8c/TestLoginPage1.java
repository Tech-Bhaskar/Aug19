package p8c;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestLoginPage1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("admin");
		loginPage.setPassword("manager");
		loginPage.clickLogin();
	}

}
