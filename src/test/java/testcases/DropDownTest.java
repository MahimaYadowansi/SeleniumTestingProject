package testcases;

import java.sql.DriverManager;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		//WebElement drop=driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		//drop.sendKeys("Eesti");
		
		//FOR DROP DOWN ALWAYS USE SELECT COMMAND
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")));
	//select.selectByVisibleText("Eesti");
	
	//TO SELECT HINDI (WHICH WE CAN NOT WRITE HERE SO USE SELECTBYVALUE
	select.selectByValue("hi");
		
	//TO COUNT TOTAL VALUE IN DROP DOWN ND TO PRINT IT
	//USE GET OPTION , we use list because there is more than one value and webdriver does not support array it only suport list
	   List<WebElement> values = driver.findElements(By.tagName("option"));
	   System.out.println("Total values are:" +values.size());
	   
	   // to get perticular index value in list
	   System.out.println(values.get(7).getText());
	   
	   for(int i=0;i<values.size();i++)
	   {
		   System.out.println(values.get(i).getText());
	   }
	   driver.close();
	}
	
}
