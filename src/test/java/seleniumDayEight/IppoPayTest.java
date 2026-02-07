package seleniumDayEight;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import seleniumDayFour.driverInfo.BaseDriver;
import seleniumDayEight.seleniumUtility.HomePage;
import seleniumDayEight.seleniumUtility.RegisterPage;




public class IppoPayTest {
	RegisterPage registerPage = new RegisterPage();
	

	static Logger logger = LogManager.getLogger(IppoPayTest.class.getName());
	
	@BeforeClass
	public void beforeClass() throws Exception {
		logger.info("In Before class");
		
	}
	
	@Test
	 public void invalidData() throws InterruptedException {
		logger.info("In invalidData");
		registerPage.openApplication();
		Assert.assertEquals(registerPage.login("data","data"),"data");
		  
	  }

	@Test
	public void validData() throws InterruptedException {
		registerPage.openApplication();

	}
	
	 @AfterMethod 
	 public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
		 if (testResult.getStatus() == ITestResult.FAILURE) {
	 		File scrFile = ((TakesScreenshot)BaseDriver.driver).getScreenshotAs(OutputType.FILE); 
	 		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\FailedScreenshots\\" + testResult.getName()+"_"+System.currentTimeMillis() +".jpg"));
	 	} 
		 
	}

	@AfterTest
	public void tearDown() {
		registerPage.closeApplication();
		logger.info("Browser closed");
	}

}
