package javaDayNineExceptionTypeCastDateEnum.exceptionHandling;

public class JavaExceptionExample{
	
	  public static void main(String args[]){  
		  
	   try{
	      //code that may raise exception
	      int data=100/0;
	   }catch(Exception e){
		  System.out.println(e);
		//  e.printStackTrace();
		  }

	 
	   //rest code of the program   
//		 int data=100/0;
	   System.out.println("rest of the code...");  
	  }  
	} 
