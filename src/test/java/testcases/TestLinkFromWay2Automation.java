package testcases;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLinkFromWay2Automation {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		WebElement search =	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
			search.sendKeys("way2automation");
			search.sendKeys(Keys.RETURN);
			WebElement auto =	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
			auto.click();
			
	   

	        // Explicitly wait for the links to be present
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        List<WebElement> links = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));

			
			System.out.println("Total link:"+links.size());
			 for (WebElement link : links) {
		            try {
		                System.out.println("Text: " + link.getText());
		                System.out.println("Href: " + link.getAttribute("href"));
		                System.out.println("------------");
		            } catch (org.openqa.selenium.StaleElementReferenceException e) {
		                // Handle StaleElementReferenceException by re-finding the links
		                links = driver.findElements(By.tagName("a"));
		            }
		        }
	}
}



			
			
	


