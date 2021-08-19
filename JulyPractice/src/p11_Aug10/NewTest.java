package p11_Aug10;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  Reporter.log("My test Demo1 Hi");
	  Reporter.log("My test Demo1 bye",false);
	  Reporter.log("My test Demo1 tata",true);
  }
}
