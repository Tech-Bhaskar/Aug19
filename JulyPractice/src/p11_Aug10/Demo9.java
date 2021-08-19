package p11_Aug10;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*to run test method with multiple data we use Data provider
 * 
 * 
 */
public class Demo9 {

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="Akash";
		data[0][1]=123;
		
		data[1][0]="Bhanu";
		data[1][1]=456;

		data[2][0]="Chandru";
		data[2][1]=789;
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void sendEmail(String name,int pin)
	{
		Reporter.log("name:"+name+" pin"+pin,true);
	}

}
