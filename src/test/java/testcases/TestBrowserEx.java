package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://yopmail.com/en/");
        driver.manage().window().maximize();
        
     
     WebElement username=driver.findElement(By.xpath("//*[@id=\"login\"]"));
     
     
     
     username.sendKeys("selenium.testing@yopmail.com");
    driver.findElement(By.xpath("//*[@id=\"refreshbut\"]")).click();
    

	}

}
