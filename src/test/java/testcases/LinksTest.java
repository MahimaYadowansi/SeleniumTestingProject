package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total link:"+links.size());
        for(WebElement link:links)
        {
        System.out.println(link.getText()+"--Url is---"+link.getAttribute("href"));
        }
	}

}
