package seleniumDayNine;

import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumDayFour.driverInfo.BaseDriver;

public class LoginTest extends BaseDriver {

    @Test
    public void googleTitleTest() {

        driver.get("https://www.google.com");
        String title = driver.getTitle();

        System.out.println("Title is: " + title);

        Assert.assertTrue(title.contains("Google"));
    }

    @Test
    public void failureDemoTest() {

        driver.get("https://www.google.com");
        Assert.assertTrue(false); // force fail to show report
    }
}

