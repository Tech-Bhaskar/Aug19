package p11_Aug10;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test(priority=3)
  public void testA() {
	  
	  Reporter.log("Hi test Demo1");
	  Reporter.log("Hi test Demo1",false);
	  Reporter.log("Hi test demo1",true);
     }
  @Test(priority=2)
  public void testB() {
	  Reporter.log("Hi test Demo2");
	  Reporter.log("Hi test Demo2",false);
	  Reporter.log("Hi test demo2",true);
  }
  @Test(priority=1)
  public void testC() {
	  Reporter.log("Hi test Demo3");
	  Reporter.log("Hi test Demo3",false);
	  Reporter.log("Hi test demo3",true);
  }
}
