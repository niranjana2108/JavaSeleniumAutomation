package seleniumDayThreeTestNG.assertExample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertExampleTest {
	
	String validateString;
    SoftAssert softAssertion= new SoftAssert();

	@Test()
    public void testEmailGenerator() {
		Assert.assertNotNull(validateString,"the assert failed");
        System.out.println("statement post hard assert");
        Assert.assertEquals(validateString, "Test");
        System.out.println("in test");
  	  Assert.assertEquals(1, 0,"this comes when its failed");
    }
	
	@Test
	 public void testEmailGeneratorSoftAsbsert() {
		 softAssertion.assertTrue(false, "failing assertion");
		 System.out.println("statement post soft assert 1");
		 softAssertion.assertEquals("Hello", "ello", "First soft assert failed");
		 System.out.println("statement post soft assert 2");
		 softAssertion.assertAll();
    }

}
