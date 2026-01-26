package seleniumDayFive.seleniumSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumDayFour.driverInfo.BaseDriver;

public class SeleniumSelect extends BaseDriver {
	
	public void openURL(){
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
	}
	
	
	public void validateCommands() throws InterruptedException {
		
		
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='course']")));
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		select.selectByValue("js");
      
        List<WebElement> lst = select.getOptions();
       

        System.out.println("options "+select.getOptions().get(0).getText());
        System.out.println("The dropdown options are:");
        for(WebElement options: lst)
            System.out.println(options.getText());

        Thread.sleep(3000);
        System.out.println("Select the Option by Index 4");
        select.selectByIndex(2);
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
        Thread.sleep(3000);
       
        
        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@id='ide']")));
        selectMultiple.selectByIndex(3);
        Thread.sleep(3000);
        selectMultiple.selectByIndex(2);
        Thread.sleep(3000);
        selectMultiple.deselectByValue("vs");
       
		
	}

}
