package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		WebElement table=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
	    
		List<WebElement> row=table.findElements(By.tagName("tr"));
	    System.out.println("Total number of row:"+row.size());
		List<WebElement> col=table.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		 System.out.println("Total number of col:"+col.size());
		 
		/* for(int rows=1;rows<=row.size();rows++)
		 {
			 List<WebElement> columns = rows.get(rows - 1).findElements(By.tagName("td"));
			for(int cols=1;cols<=col.size();cols++)
			{
				String cellData = columns.get(cols - 1).getText();
                System.
			}
			 System.out.println();
		 }*/
	}

}
