package javaDailySessions.javaDayFourOOPS.methods;

public class WithoutReturnTypeWithParameter {

	int numberOne = 5;
	int numberTwo = 5;
	int sum;
	
	public void displaySum(int numberOne,int number2) {
		sum = numberOne+number2;
		System.out.println("Sum is "+sum);
	}
	

	public static void main(String[] args) {
		WithoutReturnTypeWithParameter object = new WithoutReturnTypeWithParameter();
		object.displaySum(6,6);
		object.displaySum(5,6);
		
	}

}
