package groups_TestNG;

import org.testng.annotations.Test;

public class PClass2 {
  @Test (groups="Smoke")
  public void M1()  {
  System.out.println("Method M1");
  }
  @Test (groups={"Functional","Regression"})
  public void M2() {
	  System.out.println("Method M2");
  }
  @Test
  public void M3() {
	  System.out.println("Method M3");
  }
  @Test (groups={"Functional","Smoke"})
  public void M4() {
	  System.out.println("Method M4");
  }
  @Test (groups="Functional")
  public void M5() {
	  System.out.println("Method M5");
  }
  
}
