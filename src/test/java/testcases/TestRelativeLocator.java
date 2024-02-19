package testcases;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRelativeLocator {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
        driver.manage().window().maximize();
        
       WebElement above= driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
       above.sendKeys("selenium.testing@yopmail.com");
       
       WebElement below=driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
       below.sendKeys("Jharkhand");
       
      // WebElement near=driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/div[2]/div/p[1]/a")).near(By.xpath("//*[@id=\"load_form\"]/div[1]/div[1]/p/a")));
      // near.click();
       
       WebElement rightOf=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.tagName("label")));
       rightOf.sendKeys("selenium");
       driver.close();
	}

}
