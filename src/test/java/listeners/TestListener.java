package listeners;

import com.aventstack.extentreports.*;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.ExtentManager;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }

    public void onFinish(org.testng.ITestContext context) {
        extent.flush();
    }
}
