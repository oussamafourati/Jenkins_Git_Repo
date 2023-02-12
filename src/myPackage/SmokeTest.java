package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest {
	
	@Test
	public void loginTest() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
