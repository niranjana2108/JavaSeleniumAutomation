package javaDayNineExceptionTypeCastDateEnum.exceptionHandling;

class TestFinallyBlock{  
	  public static void main(String args[]) throws Exception{  
//		  TestThrowExample.validate(9);
	  try{ 
	   int  data=25/5;//25/0
	   
	   System.out.println(data);  
	  }  
	  catch(Exception e){
		  System.out.println(e);
		  }  
	  finally{
		  
		  System.out.println("finally block is always executed");
		  }  
	  System.out.println("rest of the code...");  
	  }  
	}