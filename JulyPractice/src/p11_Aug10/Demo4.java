package p11_Aug10;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo4 {

	@DataProvider
	public String[] getData()
	{
		String[] data= {"bhanu","prakash","Sharath"};
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void sendEmail(String s)
	{
		Reporter.log("To:"+s,true);
		Reporter.log("Click send",true);
	}
	
}
