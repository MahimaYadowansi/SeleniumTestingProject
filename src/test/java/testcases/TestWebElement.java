package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebElement {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/servicelogin?hl=en-gb");
        driver.manage().window().maximize();
        
     
     WebElement username=driver.findElement(By.id("identifierId"));
     
     
     
     username.sendKeys("mahimayadowansi@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
    
     //another way of entering data without sendkeys
     
    // JavascriptExecutor jse = (JavascriptExecutor)driver;
     //jse.executeScript("arguments[0].value='mahimayadowansi@gmail.com'", username);
	}

}
