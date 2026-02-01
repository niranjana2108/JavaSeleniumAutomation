package seleniumDaySeven.framesExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class FramesValidation extends BaseDriver {
	
	public void openURL(){
		driver.get("http://the-internet.herokuapp.com/nested_frames");
	}
	
	
	public void getFrames(){
		
		driver.switchTo().frame("frame-top");

		
		driver.switchTo().frame("frame-right");
		
		WebElement ele = driver.findElement(By.xpath("/html/body"));
		
		System.out.println(ele.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		WebElement elem = driver.findElement(By.xpath("/html/body"));
		System.out.println(elem.getText());
	
	}
	
	

}
