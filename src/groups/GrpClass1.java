package groups;

import org.testng.annotations.Test;

public class GrpClass1 {

	@Test (groups= {"smoke"})
  public void M1() {
  System.out.println("method M1");
	
	}
	@Test (groups= {"functional"})
	public void M2() {
		System.out.println("method M2");
		
	}
	@Test (groups= {"retesting"})
	public void M3() {
		System.out.println("method M3");
		
	}
	@Test (groups= {"retesting", "smoke"})
	public void M5() {
		System.out.println("method M5");
		
	}
	@Test (groups= {"functional", "smoke"})
	public void M4() {
		System.out.println("method M4");
		
	}
}
