package test.googleTest;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNgGoogle {

	WebDriver driver;
		@BeforeTest
		public void Setup() {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		
		@Test
		public void Test() throws InterruptedException {
			driver.get("https://www.google.com");
			driver.findElement(By.id("APjqb")).sendKeys("Chaitanya Patil");
			
			Thread.sleep(3000);
		}
		
		@AfterTest
		public void quit() {
			driver.quit();
		}
		
	
}
