package javaDailySessions.javaDayTwo.operators;

public class TernaryOperator {
	public static void main(String[] args) {

	    int februaryDays = 28;
	    String result;

	    // ternary operator - ?:
	    result = (februaryDays == 29) ? "Leap year" : "Not a leap year";
	    System.out.println(result);
//	    System.out.println((februaryDays == 29) ? "Leap year" : "Not a leap year");
	    int a = 0;
	    System.out.println((februaryDays == 29) ? "Leap year" : a);
	  }

}
