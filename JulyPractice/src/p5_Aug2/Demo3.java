package p5_Aug2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*1. How do u handle FileUpload popup?
 * using sendKeys method
 * 2. what is the arg for sendKeys method- absolute path of the file to be
 * uploaded
 * 3. How to upload the file using its relative path
 * 
 */
public class Demo3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Day12_Aug2nd\\PopUpDemo.html");
		Thread.sleep(1000);
		//InvalidArgumentException
//		driver.findElement(By.id("A2")).sendKeys("f:/mycv.docx");
		//WebDriverException-path is not absolute:
		File f=new File("./bhaskar/mycv.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("A2")).sendKeys(path);
		System.out.println(driver.findElement(By.id("A2")).getAttribute("value"));//to get the uploaded path
		
	}

}
