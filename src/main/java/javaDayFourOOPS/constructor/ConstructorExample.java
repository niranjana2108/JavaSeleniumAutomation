package javaDayFourOOPS.constructor;

public class ConstructorExample {
	
	int numberOne = 10;
	
	public ConstructorExample(){
		
		System.out.println("In Constructor "+numberOne);
	}
	

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample();
	//	System.out.println(ce.numberOne);

	}

	
}
