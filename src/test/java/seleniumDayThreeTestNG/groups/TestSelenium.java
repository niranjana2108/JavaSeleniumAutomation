package seleniumDayThreeTestNG.groups;

import org.testng.annotations.Test;

@Test(groups= "selenium-test")
public class TestSelenium {

	
	public void runSelenium() {
		System.out.println("runSelenium() from second class");
	}

	public void runSelenium1() {
		System.out.println("runSelenium()1 from second class");
	}
	
}