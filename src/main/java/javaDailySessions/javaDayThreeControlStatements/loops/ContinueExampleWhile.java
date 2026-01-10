package javaDailySessions.javaDayThreeControlStatements.loops;

public class ContinueExampleWhile {

	public static void main(String args[]){
		int counter=0;
		while (counter<=10)
		{
	           if (counter==7)
	           {
	        	counter++;
		       continue;
	           }
	           System.out.print(counter+"\t");
	           counter++;
		}
		System.out.println("Out of while");
	   }
	}