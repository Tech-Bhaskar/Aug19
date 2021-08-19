package p8c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//add pwTB and loginBTN
//add 2 more methods setPassword() and clickLogin()
//call those 2 new methods in TestLoginpage.java
//run TestLoginpage,post the out put
public class LoginPage {
	
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	public LoginPage(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.id("loginButton"));
	}
		
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void  setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
}
