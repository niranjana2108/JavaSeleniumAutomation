package seleniumDaySeven.windowsExample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class WindowsValidation extends BaseDriver {
	
	public void openURL(){
		driver.get("http://the-internet.herokuapp.com/windows");
	}
	
	
	public void getWindows() throws InterruptedException{
		WebElement link = driver.findElement(By.xpath("//div[@class='example']/a"));
		link.click();

		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String  handle= driver.getWindowHandle();

		System.out.println(handle);
		driver.switchTo().window(handle);


		link.click();


		Thread.sleep(3000);
		String  handle2= driver.getWindowHandle();
		
		System.out.println(handle2);
		
		driver.switchTo().window(handle2);
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		
		for(String newHandle : handles){
			
		System.out.println(newHandle);
		Thread.sleep(3000);
		driver.switchTo().window(newHandle);
	
	}
	
	}	

}
