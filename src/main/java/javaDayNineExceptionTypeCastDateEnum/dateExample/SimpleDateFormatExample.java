package javaDayNineExceptionTypeCastDateEnum.dateExample;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
 

public class SimpleDateFormatExample {  
	
public static void main(String[] args) throws InterruptedException { 
	
    Date date = new Date();  
    
    //get current date
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
//    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    String strDate= formatter.format(date);  
    System.out.println(strDate);  
    
    //get current date and time
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println(dtf.format(now));  
    
    for(int i =0;i<30;i++) {
    	Thread.sleep(2000);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("MyTestResult "+dtf.format(now1));
    }
}  
}  
