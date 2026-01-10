package javaDailySessions.javaDayEightArrayStringFiles.propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileUtility {

	public Properties prop;
	public FileInputStream fileInput;
	
	public ConfigFileUtility() {

		try {
//			fileInput = new FileInputStream("D:\\Niranjana_Class\\IntelliJSamples\\JavaSeleniumAutomation\\src\\test\\res\\ExternalFiles\\config.properties");
			fileInput = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\res\\ExternalFiles\\config.properties");
			prop = new Properties();
			prop.load(fileInput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}



	public String getDriverPath(){
		
		String driverPath = prop.getProperty("Driverpath");
		if(driverPath!= null) 
			return driverPath;
		else 
			throw new RuntimeException("driverPath not specified"); 
	}
	
	public String getURL(){
		String url = prop.getProperty("URL");
		if(url!= null) return url;
		else throw new RuntimeException("url not specified"); 
	}
	
	public String getDataFilePath(){
		String dataFilePath = prop.getProperty("DataFilePath");
		if(dataFilePath!= null) return dataFilePath;
		else throw new RuntimeException("dataFilePath not specified"); 
	}
	
	public String getDataFromPropertyFile(String key){
		String value = prop.getProperty(key);
		if(value!= null) return value;
		else throw new RuntimeException("key/value not specified"); 
	}
	
	public static void main(String args[]) throws Exception {
		ConfigFileUtility configFileUtility = new ConfigFileUtility();
		System.out.println("Driver Path: "+configFileUtility.getDriverPath());
		System.out.println("URL: "+configFileUtility.getDataFromPropertyFile("URL"));
	}
	
}
