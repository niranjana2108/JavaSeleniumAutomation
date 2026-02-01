package seleniumDaySix.webTableExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import seleniumDayFour.driverInfo.BaseDriver;

public class WebTableExample extends BaseDriver {
	
	public void openURL(){
		driver.get("https://the-internet.herokuapp.com/tables");
	}
	
	public void validateTable() {
	
	List<WebElement> columns = 	driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));	
	System.out.println("Number of columns "+columns.size());
	
	
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));	
	System.out.println("Number of rows "+rows.size());
	
	//table[@id='table1']/tbody/tr[1]/td[2]
	
	for(int i=1;i<=rows.size();i++) {
		for(int j=1;j<=columns.size();j++) {
			WebElement cellData = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
			System.out.println(cellData.getText());
		}
		System.out.println();
		
	}
	
	
	
	

	}
	
	
}
