package p10_Aug9;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleLoginPage {

	
		@FindBy(xpath="//a")private List<WebElement> allLinks;
		
		
		public GoogleLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
          public void getlinks() {
	         System.out.println(allLinks.size());
	         }
          public void gettext() {
        	  for(int i=0; i<allLinks.size();i++)
        	  {
        		  
        		  System.out.println(allLinks.get(i).getText());
        	  }
        	  
          }
//        	  for(WebElement link:allLinks) {
//        		  System.out.println(link.getText());
//        	  }
          
}
