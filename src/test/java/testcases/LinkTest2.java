package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTest2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		//access link from perticular section driver-->block-->
		WebElement block=driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/nav"));
		
		
		List<WebElement> links=block.findElements(By.tagName("a"));
        System.out.println("Total link:"+links.size());
        for(WebElement link:links)
        {
        System.out.println(link.getText()+"--Url is---"+link.getAttribute("href"));
        }

	}

}
