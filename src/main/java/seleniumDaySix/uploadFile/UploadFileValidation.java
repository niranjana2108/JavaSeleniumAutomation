package seleniumDaySix.uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class UploadFileValidation extends BaseDriver {
	
	public void openURL(){
		driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");
	}
	
	
	public void validateCommands() {
		
		WebElement uploadFileButton = driver.findElement(By.id("fileinput"));
		
		uploadFileButton.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata.xlsx");
		
	}


	public void validateDownload() {
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/download.html");
		WebElement downloadFileButton = driver.findElement(By.xpath("//a[text()='WebDriverManager logo']"));
		downloadFileButton.click();
	}

}
