package seleniumDayFive.waitExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumDayFour.driverInfo.BaseDriver;

public class WaitValidation extends BaseDriver {

	public void openURL(){

		driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
	}


	public void validateWait() throws InterruptedException{

		driver.findElement(By.id("button00")).click();
		driver.findElement(By.id("button01")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button02")));
		driver.findElement(By.id("button02")).click();
	}

	public void validateImplicitWait() {


		driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
		driver.findElement(By.id("button00")).click();
		driver.findElement(By.id("button01")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("button02")).click();
		driver.findElement(By.id("button03")).click();
	}

}
