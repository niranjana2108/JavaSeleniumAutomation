package seleniumDaySix.dynamicDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class DynamicDropdown extends BaseDriver {
	
	public void openURL(){
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/dropdown-menu.html");
	}
	
	
	
	
	public void dropdownValidationOne() throws Exception {
		
		driver.findElement(By.id("my-dropdown-1")).click();
		Thread.sleep(3000);
		WebElement option = driver.findElement(By.xpath("//button[text()='Use left-click here']/following-sibling::ul[contains(@class,'dropdown-menu')]//a[text()='Another action']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", option);
		//option.click();
	}
	
	public void dropdownValidationTwo() throws Exception {
		driver.get("https://www.naukri.com/");
		driver.findElement(By.className("dropArrowDD")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='dropdown ']//span[text()='1 year']")).click();
	}

}
