package parallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Testing_Class1 {
	
	WebDriver driver;
	@Parameters ("user")
	@BeforeClass
	public void init(String Browser1) {
		
		if(Browser1.contains("Chrome")) {
			
			driver=new ChromeDriver();
			
		}else if(Browser1.contains("edge")) {
			driver=new EdgeDriver();
			
			
		}else {
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void enterUserName() {
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("sumit@123");
		
	}
	
	@Test
	public void enterPassword() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
	}
	
	@Test
	public void loginButton() {
		driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm']")).click();
	}

	@AfterClass()
	public void tearDown() throws InterruptedException {

		Thread.sleep(5000);
	}
	
}
