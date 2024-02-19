package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.ByteString.Output;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.way2automation.com");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		if(driver instanceof FirefoxDriver)
		{
			 //TO CAPTURE FULLSCREEN
	        File FullPageScreenshot=((HasFullPageScreenshot) driver).getFullPageScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(FullPageScreenshot, new File("./Screenshot/Fullpage.jpg"));
		}
		else if(driver instanceof ChromeDriver)
		{
		//TO CAPTURE VISIBLE SCREEN
		File pageScreenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pageScreenshot, new File("./Screenshot/page.jpg"));
		}
       
	}

}
