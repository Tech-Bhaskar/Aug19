package p11_Aug10;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test(invocationCount=3)
  public void createuser() {
	  
	  
	  Reporter.log("FN:Bhanu",true);
	  Reporter.log("Create User",true);
     }
  
}
