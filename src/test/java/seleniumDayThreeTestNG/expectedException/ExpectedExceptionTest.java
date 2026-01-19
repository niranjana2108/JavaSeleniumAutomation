package seleniumDayThreeTestNG.expectedException;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	
	@Test
    public void divisionWithException() {
		System.out.println("testing exceptions 1");
        int i = 1 / 0;
    }
	
	@Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithExpectedException() {
		System.out.println("testing exceptions 2");
        int i = 1 / 0;
    }

}
