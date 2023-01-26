package seleniumpck;

import java.util.Set;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P16 {

	public static void main(String[] args) throws InterruptedException {

// step-1 launch instance of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#top");
		Thread.sleep(2000);
		WebElement NewTabB = driver.findElement(By.xpath("//a[contains(@id,'opentab')]"));
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView();", NewTabB);
		Thread.sleep(2000);
		NewTabB.click();

		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");

		/*
		 * // get windpw hangle of parant tab String ParentTab=driver.getWindowHandle();
		 * System.out.println(ParentTab);
		 * 
		 * Thread.sleep(2000); Set<String> allTabs=driver.getWindowHandles();
		 * System.out.println(allTabs.size());
		 * 
		 * // using for each loop for (String tab:allTabs) { System.out.println(tab);
		 * 
		 * if (!tab.equals(ParentTab)) {
		 * System.out.println("current windwo is child tab");
		 * 
		 * // switching to the tab driver.switchTo().window(tab);
		 */

	}

}
