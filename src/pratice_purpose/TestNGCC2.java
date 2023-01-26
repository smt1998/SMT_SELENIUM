package pratice_purpose;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGCC2 {
// 1. Before Suite
// 2. Before Test
// 3. Before Class
// 4. Before Method
// 5. test
// 6. After Method
// 7. After Class
// 8. After Test
// 9. after Suite
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BEFORE SUITE");
	}
	

@BeforeClass
public void BeforeClass() {
	System.out.println("BeforeClass");
}

@BeforeTest

public void BeforeTest() {
	System.out.println("BEFORE TEST");
}

@Test
public void Test() {
	  System.out.println("test");
}

@Test
public void Test2() {
	System.out.println("test2");
}
	
@Test
public void Test3() {
	System.out.println("Test3");
}
@AfterMethod
public void AfterMethod() {
	System.out.println("AfterMethod");
}
@BeforeMethod

public void BeforeMethod() {
	System.out.println("BeforeMethod");
}

@AfterClass
public void AfterClass() {
	System.out.println("After Class");
}
@AfterTest
public void AfterTest() {
	System.out.println("AfterTest");
}

@AfterSuite
public void aftersuite() {
	System.out.println("after suite");
}
  
  
}




















