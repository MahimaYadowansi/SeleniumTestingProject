package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
        System.out.println(driver.findElements(By.tagName("frameset")).size());
        //frame switch
        
        
        driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[1]")));
        WebElement input=driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input"));
        input.sendKeys("Hey, frame");
        driver.switchTo().defaultContent();
       
        //frame2
        driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[1]")));
        WebElement input2=driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input"));
        input2.sendKeys("hey,frame2");
        driver.switchTo().defaultContent();
        
        //frame4
        driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[3]")));
        WebElement input4=driver.findElement(By.xpath("//*[@id=\"id4\"]/div/input"));
        input4.sendKeys("Hey,frame4");
        driver.switchTo().defaultContent();
        
        //frame5
        driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));
        WebElement input5=driver.findElement(By.xpath("//*[@id=\"id5\"]/div/input"));
        input5.sendKeys("Hey,frame5");
        driver.switchTo().defaultContent();
        
        //frame3
        
        driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[2]")));
        WebElement input3=driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input"));
        input3.sendKeys("Hey,frame3");
        //switch to iframe from frame3
        
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/center/iframe")));
        //scroll till we find element
       WebElement radio=driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", radio);
        radio.click();
        
        WebElement check=driver.findElement(By.xpath("//*[@id=\"i19\"]/div[2]"));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].scrollIntoView(true)", check);
        check.click();
        
        WebElement drop=driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[1]/div[1]/div[1]/span"));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView(true)", drop);
        Select select=new Select(driver.findElement(By.xpath("//*/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]")));
        select.selectByVisibleText("yes");
        
        //button
        WebElement btn=driver.findElement(By.xpath("//*/div[3]/div[1]/div[1]/div/span/span"));
        JavascriptExecutor jse3 = (JavascriptExecutor) driver;
        jse3.executeScript("arguments[0].scrollIntoView(true)", btn);
        btn.click();
        		
        		
        
	}

}
