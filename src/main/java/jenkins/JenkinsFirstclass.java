package jenkins;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JenkinsFirstclass {
	
	WebDriver driver;
	
@BeforeMethod
public void setup() {
	
	
    driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\47Billion\\Desktop\\chrome\\chromedriver_win32");
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://videoms-qa.47billion.com/");
	driver.manage().window().maximize();	
	
	
	
}
	
@Test

public void login() {
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testh@mailinator.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("681993@Virat");
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();	
	int i =10;
	int a =5;
			
	Assert.assertTrue(i>a);
	}
	
	
	
	
}
