package javaDailySessions.javaDayFourOOPS.constructor;

public class ConstructorOverloading {
	
	int number = 10;
	
	public ConstructorOverloading() {
		System.out.println("In Constructor");
	}
	
	
	public ConstructorOverloading(int number){
		System.out.println("In Constructor displaying local variable "+ number );
		System.out.println("In Constructor displaying instance variable "+ this.number );
	}
	
	public ConstructorOverloading(String dataOne,String dataTwo){
		System.out.println(dataOne+" "+ dataTwo);
	}
	

	public static void main(String[] args) {
		ConstructorOverloading pcOne = new ConstructorOverloading();
		ConstructorOverloading pcTwo = new ConstructorOverloading(100);
		ConstructorOverloading pcThree = new ConstructorOverloading("Test","Data");
		

	}

}
