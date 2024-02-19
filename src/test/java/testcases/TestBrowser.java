package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		String title=(driver.getTitle());
		System.out.println(title.length());
		System.out.println(title);
		driver.close();// IT CLOSE CURRET BROWSER
		//driver.quit(); //IT CLOSE CURRENT AS WELL AS ALL RELEATED BROWSER
	}

}
