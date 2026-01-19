package seleniumDayThreeTestNG.dependsOn;

import org.testng.annotations.Test;

public class DependsOnMethod {
	 @Test
	    public void method1() {
	        System.out.println("This is method 1");
	    }
	 
	 //if method 1 fails then method 2 is skipped
	 
//	 @Test
//	    public void method1() {
//	        System.out.println("This is method 1");
//	        throw new RuntimeException();
//	    }


	    @Test(dependsOnMethods = { "method1" })
	    public void method2() {
	        System.out.println("This is method 2");
	    }
	    
	    
	    
}
