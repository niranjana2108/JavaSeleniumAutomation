package javaDailySessions.javaDayFourOOPS.methods;

public class WithoutReturnTypeWithoutParameter {
	
	int numberOne = 5;
	int numberTwo = 5;
	int sum;
	
	public void displaySum() {
		sum = numberOne+numberTwo;
		System.out.println("Sum is "+sum);
	}
	

	public static void main(String[] args) {
		WithoutReturnTypeWithoutParameter object = new WithoutReturnTypeWithoutParameter();
		object.displaySum();
		object.displaySum();
	}

}
