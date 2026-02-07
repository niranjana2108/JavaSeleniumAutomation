package seleniumDayNine;

import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumDayNine.BaseTest;

public class GoogleTest extends BaseTest {

    @Test
    public void openGoogle() throws Exception {

        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(3000); // just for demo visibility

        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
}
