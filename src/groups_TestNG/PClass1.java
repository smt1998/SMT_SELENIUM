package groups_TestNG;

import org.testng.annotations.Test;

public class PClass1 {
  @Test (groups={"Smoke","Regression"})
  public void login() {
	  System.out.println("test case login");
  
  }
  @Test (groups="Functional")
  public void getTitle() {
	  System.out.println("test case getTitle");
	  
  }
  @Test (groups={"Functional","Smoke"})
  public void CheckBoxClick() {
	  System.out.println("test case CheckBoxClick");
	  
  }
  @Test (groups="Regression")
  public void logout() {
	  System.out.println("test case logout");
	  
  }
  
}
