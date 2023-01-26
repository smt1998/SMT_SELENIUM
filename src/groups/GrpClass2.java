package groups;

import org.testng.annotations.Test;

public class GrpClass2 {
	@Test (groups= {"smoke"})
	  public void N1() {
	  System.out.println("method N1");
		
		}
		@Test (groups= {"functional"})
		public void N2() {
			System.out.println("method N2");
			
		}
		@Test (groups= {"retesting","functional"})
		public void N3() {
			System.out.println("method N3");
			
		}
		@Test (groups= {"retesting", "smoke","functional"})
		public void N5() {
			System.out.println("method N5");
			
		}
		@Test (groups= {"functional", "smoke"})
		public void A() {
			System.out.println("method A");
			
}}
