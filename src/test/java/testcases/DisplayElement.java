package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		// IT CHECK THE VISIBILITY: Is.Didplay()
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());
		System.out.println(driver.findElement(By.id("searchLanguage")).isDisplayed());
	    
		//IsSelected: element is selected or not
		//IsEnabled:  element is enabled or disable
	}

}
