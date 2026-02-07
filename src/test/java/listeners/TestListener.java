package listeners;

import com.aventstack.extentreports.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.ExtentManager;

import java.io.File;
import java.io.IOException;

import static seleniumDayFour.driverInfo.BaseDriver.driver;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    public void onFinish(org.testng.ITestContext context) {
        extent.flush();
    }

    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String screenshotPath = "screenshots/"
                + result.getName() + "_"
                + System.currentTimeMillis() + ".png";

        try {
            File dest = new File(System.getProperty("user.dir") + "/" + screenshotPath);
            dest.getParentFile().mkdirs();
            FileUtils.copyFile(src, dest);

            test.addScreenCaptureFromPath("../" +screenshotPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
