package javaDaySixPolymorphismSuperFinal.finalExample;

public class FinalKeyword {
	
	final int ACCOUNT_NUMBER_DEFAULT_VALUE;
	
	final int a=5;
	
	public static final int MAX_VALUE = 10;
	
	public static final int test;
	static {
		test = 10;
	}
	
	//initializing final variable inside constructor
	final int testTwo ;
	
	
	FinalKeyword() {
		
		testTwo = 10;
		ACCOUNT_NUMBER_DEFAULT_VALUE=10;
	}
	
	
	
	 static final int speedlimit = 456;//final variable  
	 public static void run(){ 
		
//	  speedlimit=400;  
	 }  
	 public static void main(String args[]){  
		 FinalKeyword obj=new  FinalKeyword();  
	 obj.run();  
	 }  

}
