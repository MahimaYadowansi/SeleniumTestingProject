package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkidosTesting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://skidos.com/");
        driver.manage().window().maximize();
        
     
     WebElement signup=driver.findElement(By.xpath("//*[@id=\"menu-item-21764\"]/a/span"));
     signup.click();
     WebElement email=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/form/input"));
     
     email.sendKeys("selenium.testing@yopmail.com");
     
     WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
     password.sendKeys("rapidcub19");
    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/form/button")).click();
    

	}

}
