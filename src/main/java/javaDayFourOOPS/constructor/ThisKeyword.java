package javaDayFourOOPS.constructor;

public class ThisKeyword {
	
	//instance variable 
	int numberOne = 10;
	
	public ThisKeyword() {
		
		System.out.println("In Constructor");
	}
	
	public ThisKeyword(String data) {
		//refer constructor
		this();
		System.out.println(data);
	}
	public void printData(int numberOne) {
		//local variable
		int i;
		//refer instance variable
		System.out.println(this.numberOne);
		
		System.out.println(numberOne);
		//refer class method
		this.callMethod();	
	}
	public void callMethod() {
		System.out.println("calling callMethod");
	}
	
    public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword("TestData");
		tk.printData(34);

	}

}
