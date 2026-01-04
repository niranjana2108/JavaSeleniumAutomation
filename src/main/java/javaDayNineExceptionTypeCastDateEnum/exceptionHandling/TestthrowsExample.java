package javaDayNineExceptionTypeCastDateEnum.exceptionHandling;

import java.io.IOException;

public class TestthrowsExample {
	
	 void m()throws IOException{  
		    throw new IOException("device error");//checked exception  
		  }  
	 
		  void n() throws Exception{  
		    m();  
		  }  
		  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }
		  
		  
		  public static void main(String args[]) throws Exception{  
			  TestthrowsExample obj=new TestthrowsExample();  
		   obj.p();  
		   obj.n();  
		   System.out.println("normal flow...");  
		  }  

}
