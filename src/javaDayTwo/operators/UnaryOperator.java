package javaDayTwo.operators;

public class UnaryOperator {
	public static void main(String[] args) {
	    
	    // declare variables
	    int a = 12, b = 12;
	    int result1, result2;

	    // original value
	    System.out.println("Value of a: " + a );

	    // increment operator - a=a+1
	    result1 = ++a;
	    System.out.println("After increment: " + result1);

	    System.out.println("Value of b: " + b);
//
	    // decrement operator
	    result2 = --b;
	    System.out.println("After decrement: " + result2);
//	    
	    //post-increment
	    System.out.println("After post increment: " + a++);
	    System.out.println("After post increment: " + a++);
	   
	  }

}
