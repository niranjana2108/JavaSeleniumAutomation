package seleniumDaySix;

import org.testng.annotations.Test;

import seleniumDaySix.uploadFile.UploadFileValidation;


public class UploadFileTest {
	UploadFileValidation uploadFileValidation = new UploadFileValidation();
	
	
  @Test
  public void upload() {
	  uploadFileValidation.openURL();
	  uploadFileValidation.validateCommands();
  }
  
  @Test
  public void download() {
	  uploadFileValidation.validateDownload();
  }
 
}
