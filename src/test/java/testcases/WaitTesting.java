package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTesting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://yopmail.com/en/");
        driver.manage().window().maximize();
        
        //implicit wait:- wait for all element contain in driver
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
        //explicit wait
        WebDriverWait wait=new  WebDriverWait(driver, Duration.ofSeconds(5));
     WebElement username=driver.findElement(By.xpath("//*[@id=\"login\"]"));
     
     
     
     username.sendKeys("selenium.testing@yopmail.com");
    driver.findElement(By.xpath("//*[@id=\"refreshbut\"]")).click();
	}

}
