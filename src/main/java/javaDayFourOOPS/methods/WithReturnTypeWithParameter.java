package javaDayFourOOPS.methods;

public class WithReturnTypeWithParameter {

	int numberOne = 5; //local numberOne
	int numberTwo = 5; //local number2
	int sum;
	
	public int displaySum(int numberOne,int number2) {
//		this.numberOne = numberOne;
//		numberTwo = number2;
		sum = this.numberOne+number2;
		return sum;
	}
	
	
	

	public static void main(String[] args) {
		WithReturnTypeWithParameter object = new WithReturnTypeWithParameter();
		
		int sumReturned = object.displaySum(7,7);
		
		System.out.println("Sum is "+sumReturned);
	}

}
