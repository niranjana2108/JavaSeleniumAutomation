package javaDayFourOOPS.constructor;

public class ParameterizedConstructor {
	
	int number = 10;
	
	public ParameterizedConstructor(int number){
		System.out.println("In Constructor displaying local variable "+ number );
		System.out.println("In Constructor displaying instance variable "+ number );
	}
	
	
	public static void main(String[] args) {
		ParameterizedConstructor pc = new ParameterizedConstructor(100);
//		ParameterizedConstructor pcOne = new ParameterizedConstructor();
		

	}

}
