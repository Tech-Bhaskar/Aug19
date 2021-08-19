package p3_jul30;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//print list box content in sorted order
//check if list box has any duplicate options
//print list box content in reverse sorted order
//we can use select class only on the list box(<select>)else we get UnexpectedTagNameException
public class Demo12 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Day10_july30\\ListBox2.html");
		WebElement listBox = driver.findElement(By.id("A2"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		ArrayList<String> allText=new ArrayList<String>();
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			allText.add(text);
		}
			
		System.out.println(allText);
		
		Collections.sort(allText);//DefaultNaturalSortingOrder collection is interface 
		//and collections is a class
		
		System.out.println(allText);
		
		driver.close();
	}

}
