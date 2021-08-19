package p3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2_1 {
	/* if comparision fails then it will not execute remaining code
	 * of current test method
	 * 
	 */
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}

	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@Test
	public void testA()
	{
		Reporter.log("create user",true);
		Assert.assertEquals("abc","xyz");
		Reporter.log("delete user",true);
		
	}
}
