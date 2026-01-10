package javaDailySessions.javaDayNineExceptionTypeCastDateEnum.exceptionHandling;

public class TestThrowExample {
	
	 static void validate(int age) throws Exception   {  
		 
	     if(age<18) 
	    	throw new Exception("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	 
	 
	 
	   public static void main(String args[]) throws Exception  {  
	      validate(8);  
	      System.out.println("rest of the code...");  
	  }  

}
