package testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// switch to another tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Hello selenium 4");
		
		//switch to another window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://gmail.com/");
		System.out.println(driver.getTitle());
		
	//	TO KNOW HOW MAY WINDOW IS OPENED
		System.out.println(driver.getWindowHandles().size());
		
		//itterate through window and perform operation
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> iterator=window.iterator();
		
		List<String> winIndex =new ArrayList<String>();
		while(iterator.hasNext())
		{
			winIndex.add(iterator.next());
		}
		
		//FRIST WINDOW
		
		driver.switchTo().window(winIndex.get(0)); 
		//check the window bt its title
		System.out.println("THE FIRST WINDOW TITLE IS:"+driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		//2ND WINDOW
		driver.switchTo().window(winIndex.get(1));
		System.out.println("THE SECOND WINDOW TITLE IS:"+driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		
//THIRD WINDOW
		driver.switchTo().window(winIndex.get(2));
		System.out.println("THE THIRD WINDOW TITLE IS:"+driver.getTitle());
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
