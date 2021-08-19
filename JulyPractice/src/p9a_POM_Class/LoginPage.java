package p9a_POM_Class;
/*POM-Page Object Model
 * why do we use it---to handle StaleElementReferenecException
 * 3 steps? Declaration ,initi,,utiliz..
 * How do u declare element in POM class? @FindBY
 * How do u initilaize element in POM class?  PF.init...
 * How do u utilize the element ---using get/set methods
 * can we run POM class directly? NO
 * why? no main method (we dont write main method in POM)
 * we write main method in diff class---Test class(Runner class)
 * 
 * in which class we store the element-POM class- Element Repository class
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM class
public class LoginPage {
	
//declearation
	@FindBy(id="username") private WebElement unTB;
	@FindBy(name="pwd")private WebElement pwTB;
	@FindBy(xpath="//div[text()='Login ']") private WebElement LoginBTN;
	@FindBy(xpath="//span[contains(text(),'Username')]") private WebElement errMsg;
	
	
	//Initilazation
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void setUN(String un) {
		unTB.sendKeys(un);
	}
	public void setPW(String pw) {
		pwTB.sendKeys(pw);
	}
	public void clickBTN() {
		LoginBTN.click();
	}
	
	public void Invalid() {
		
	boolean appear = errMsg.isDisplayed();
	System.out.println(appear);
	       if(appear) {
	    	  System.out.println("login error Appeared");
	       }
	       else {
	    	   System.out.println("login error not Appeared");
	       }
	}
	
}
