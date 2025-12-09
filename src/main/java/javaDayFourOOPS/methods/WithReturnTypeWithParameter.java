package javaDayFourOOPS.methods;

public class WithReturnTypeWithParameter {

	int numberOne = 5;
	int numberTwo = 5;
	int sum;
	
	public int displaySum(int numberOne,int number2) {
		sum = numberOne+number2;
		return sum;
	}


	public static void main(String[] args) {
		WithReturnTypeWithParameter object = new WithReturnTypeWithParameter();
		
		int sumReturned = object.displaySum(7,7);
		
		System.out.println("Sum is "+sumReturned);
	}

}
