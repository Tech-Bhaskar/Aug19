package p11_Aug10;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*to run test method with multiple data we use Data provider
 * 
 * 
 */
public class Demo5 {

	@DataProvider
	public String[][] getData()
	{
		String[][] data= new String[2][3];
		data[0][0]="Akash";
		data[0][1]="Hi";
		data[0][2]="A1";
		
		
		data[1][0]="Bhanu";
		data[1][1]="Bye";
		data[1][2]="B1";
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void sendEmail(String to,String sub,String id)//
	{
		Reporter.log("To:"+to+" Sub:"+sub+ " id:"+id,true);//
	}
	/*number of test method iteration depends on- num of rows
	 * number of test method  arg depends on num  of col
	 * 
	 * 
	 * 
	 */
}
