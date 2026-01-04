package javaDayNineExceptionTypeCastDateEnum.exceptionHandling;

public class TryCatchExample {  
	  
    public static void main(String[] args) throws Exception  {  
    	
        //may throw exception   
       try {
    	   int data=50/0;
		//Thread.sleep(1000);
	} 
       catch (Exception e) {
		// TODO Auto-generated catch block
    	   System.out.println(e);
//		e.printStackTrace();
	}
       
       Thread.sleep(1000);
       
        System.out.println("rest of the code");  
    }  
      
}  
