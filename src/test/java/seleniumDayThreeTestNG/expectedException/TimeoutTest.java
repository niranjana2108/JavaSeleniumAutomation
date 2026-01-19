package seleniumDayThreeTestNG.expectedException;

import org.testng.annotations.Test;

public class TimeoutTest {
 
	@Test(timeOut = 5000) // time in milliseconds
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test(timeOut = 2000) //can be used for performance testing
    public void testThisShouldFail() {
        while (true);
    }
}
