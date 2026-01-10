package javaDailySessions.javaDayThreeControlStatements.loops;

public class BreakDoWhileExample {
	
	public static void main(String args[]) {
		
		 int num =0;
		 
		     do
		      {
		          System.out.println("Value of variable is: "+num);
		          if (num==7)
		          {
		             break;
		          }
		          num++;
		      } while(num<=10);
		      System.out.println("Out of do-while-loop");
		
		
	}
	
}

