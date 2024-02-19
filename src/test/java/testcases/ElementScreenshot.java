package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//above element
		WebElement above=driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[3]/input")).above(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select")));
		above.sendKeys("jhon_jack@gmail.com");
		File abovescrn= above.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(abovescrn, new File("./screenshot/above.jpg"));
		
		//below
		WebElement below=driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[5]/input")).below(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select")));
		below.sendKeys("USA");
		File belowscrn= below.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(belowscrn, new File("./screenshot/below.jpg"));
		
		//rightOf
		WebElement rightOf=driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).toRightOf(By.tagName("label")));
		rightOf.sendKeys("jhon");
		File rightOfscrn= rightOf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(rightOfscrn, new File("./screenshot/rightOf.jpg"));
		rightOf.click();
	}

	}


