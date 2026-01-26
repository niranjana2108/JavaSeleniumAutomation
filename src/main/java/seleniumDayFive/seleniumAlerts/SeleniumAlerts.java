package seleniumDayFive.seleniumAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import seleniumDayFour.driverInfo.BaseDriver;

public class SeleniumAlerts extends BaseDriver {
	
	public void openURL(){
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//maximize
		 driver.manage().window().maximize();
	}
	
	Alert alert;
	
	
	public void simpleAlert() throws InterruptedException {
		 driver.findElement(By.id("alertBox")).click();
		 
		 alert = driver.switchTo().alert();
		 
		  Thread.sleep(2000);
		  alert.accept();
		  
	}
	
	public void promptAlert() throws InterruptedException  {
		driver.findElement(By.id("promptBox")).click();
	
		//alert switch
		alert = driver.switchTo().alert();
		   String alertText = alert.getText();
		   System.out.println("Alert text is " + alertText);
		   		  //Send some text to the alert
		   Thread.sleep(2000);
		   alert.sendKeys("Test User");
		   alert.accept();
		   	
	}
	
	public void acceptDismissAlert() throws InterruptedException  {
		 driver.findElement(By.id("confirmBox")).click();
		 Thread.sleep(2000);
		 alert = driver.switchTo().alert();
		  //alert.accept();
		 alert.dismiss();
	}
	
	

}
