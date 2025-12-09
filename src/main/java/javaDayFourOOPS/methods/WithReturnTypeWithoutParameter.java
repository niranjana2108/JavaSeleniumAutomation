package javaDayFourOOPS.methods;

public class WithReturnTypeWithoutParameter {

		int numberOne = 5;
		int numberTwo = 5;
		int sum;
		
		public int displaySum() {
			sum = numberOne+numberTwo;
			return sum;
		}
		

		public static void main(String[] args) {
			WithReturnTypeWithoutParameter object = new WithReturnTypeWithoutParameter();
			
			int sumValue = object.displaySum();
			
			System.out.println(object.displaySum());
			
			System.out.println("Sum is "+sumValue);
			sumValue+=15;
		}

}
