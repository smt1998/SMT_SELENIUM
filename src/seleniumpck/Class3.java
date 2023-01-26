package seleniumpck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
public static void main(String[] args) throws InterruptedException {
	
	// instance of chrome
	WebDriver dio=new ChromeDriver();
	
	// to mzaximize the windows
	
	dio.manage().window().maximize();
	
	// to open web page
	
	dio.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_1cfjttkdmt_e&adgrpid=58507629306&hvpone=&hvptwo=&hvadid=486388034337&hvpos=&hvnetw=g&hvrand=1930384137069118787&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301828&hvtargid=kwd-28878962&hydadcr=14456_2154379&gclid=CjwKCAiApvebBhAvEiwAe7mHSCa2RJD34Hy8qFmMTXgiPauADygrfZ9U1Xfjbk0zcFoEtPS1JZwR4xoChm0QAvD_BwE");
	
	// to add timing to the url 
	
	Thread.sleep(15000);
	// to stop operation
	
	dio.close();
	
	
	
	
	
}
}
