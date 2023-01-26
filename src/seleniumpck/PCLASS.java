package seleniumpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PCLASS {

	public static void main(String[] args) {
		
WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://jqueryui.com/slider/");

WebElement IframeFind=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

driver.switchTo().frame(IframeFind);


		
		
		
		
		
	}
	
}
