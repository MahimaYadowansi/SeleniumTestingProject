package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindPresenceOfElement {
	
	//TO CHECK THE PRESENCE OF ELEMENT ::: THERE IS NO METHOD IN DRIVER USE UR OWN LOGIC
	public static WebDriver driver;
	public static boolean isElementPresent(By locator) {
	 try{
	driver.findElement(locator);
	return true;
	 }catch(Throwable t)
	{
		 return false;
	}
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		System.out.println(isElementPresent(By.xpath("//*[@id=\"searchInput\"]")));
	    
		driver.close();
	}

}
