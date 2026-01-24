package seleniumDayFour.driverInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
	public static WebDriver driver;
	static{
		//chrome driver
		WebDriverManager.chromedriver().setup();   // ✅ No download / no system.setProperty
		driver = new ChromeDriver();
	}

}
