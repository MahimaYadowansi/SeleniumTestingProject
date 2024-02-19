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

public class JavatPointLinkTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	WebElement search =	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search.sendKeys("Javatpoint");
		search.sendKeys(Keys.RETURN);
		WebElement javatpoint=driver.findElement(By.tagName("h3"));
		javatpoint.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		List<WebElement> links=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
		int count=links.size();
		System.out.println("Total links:"+count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println("Href: " + links.get(i).getAttribute("href"));
		}
	}

}
