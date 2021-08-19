package p3_jul30;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo9 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Day10_july30\\ListBox2.html");
		
		WebElement listBox = driver.findElement(By.id("A3"));
		Select select=new Select(listBox);
		WebElement element = select.getWrappedElement();
		System.out.println(element.getText());
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
//		int count=selectedOptions.size();
//		System.out.println("Number of selected options:"+count);
//		
//		for(int i=0;i<count;i++) 
//		{
//			WebElement option = selectedOptions.get(i);
//			String text=option.getText();
//			System.out.println(text);
//		}
//		
//		WebElement option = select.getFirstSelectedOption();
//		System.out.println("First Selected option:"+option.getText());
//		
//		List<WebElement> allOptions = select.getOptions();
//		int count2=allOptions.size();
//		System.out.println("Number of options:"+count2);
//		
//		for(int i=0;i<count2;i++)
//		{
//			String text=allOptions.get(i).getText();
//			System.out.println(text);
//		}
//		
		driver.close();
		
	}

}
