package seleniumDayFour.practisePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import seleniumDayFour.driverInfo.BaseDriver;

public class TextBoxValidation extends BaseDriver {
	
	public void openURL(){
		driver.get("https://demoqa.com/text-box");
	}
	
	
	public void webElementAction() throws InterruptedException{
		
		WebElement name = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		
		
		
		

//		WebElement nameXpath = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/form/div/div[2]/input"));
		WebElement nameRelativeXpath = driver.findElement(By.xpath("//form/div/div[2]/input"));
		
		name.sendKeys("test");
		
		Thread.sleep(3000);
		
		name.clear();
		
//		
		
		
	}

}
