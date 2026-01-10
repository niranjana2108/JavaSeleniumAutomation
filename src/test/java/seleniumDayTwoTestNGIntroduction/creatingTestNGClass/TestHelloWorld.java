package seleniumDayTwoTestNGIntroduction.creatingTestNGClass;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloWorld {
  @Test
  public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = null;
		//= obj.generate();
		
		
		Assert.assertNotNull(email);
		Assert.assertEquals(email, "testngtest@test.com");

	}

}
