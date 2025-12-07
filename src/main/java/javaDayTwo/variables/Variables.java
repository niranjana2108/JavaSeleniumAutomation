package javaDayTwo.variables;

public class Variables {
	//instance variable 
	int dataOne = 10;

	//static variable
	static int dataThree=90;

	public void displayData() {
		dataOne = 18;
		int a = 5;
	System.out.println(dataOne);
	System.out.println(a);
	}

	
	public void displayData2() {
	int newVariable = 6;
	System.out.println(dataOne);
	System.out.println(dataThree);
	System.out.println(newVariable);
	}
	
	public static void main(String[] args) {
		
		//classname objectname = new class's constructor
		Variables va = new Variables();
		Variables va1 = new Variables();
		va.dataOne = 19;
		va.displayData();
		va1.displayData2();
		//local variable 
		int dataTwo = 20;
		System.out.println("hi "+va.dataOne);
	//	System.out.println(newVariable);
		System.out.println(dataTwo);
		System.out.println(dataThree);
		

	}
	

}
