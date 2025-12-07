package javaDayThreeControlStatements.loops;

public class BreakWhileExample {
	
	public static void main(String args[]) {
		
		 int num =0;
		 
		      while(num<=10)
		      {
		          System.out.println("Value of variable is: "+num);
		          if (num==7)
		          {
		        	  break;
		          }
		          num++;
		      }
		      System.out.println("Out of while-loop");
		
		
	}
	
}

