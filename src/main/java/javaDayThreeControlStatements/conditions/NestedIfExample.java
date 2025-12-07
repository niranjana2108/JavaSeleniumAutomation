package javaDayThreeControlStatements.conditions;

public class NestedIfExample {

	   public static void main(String args[]){
		   boolean boolValue = false;
	        int num=170;
		if( num < 100 ){ 
	           System.out.println("number is less than 100"); 
	           if(num > 50){
		      System.out.println("number is greater than 50");
		   } else {
			   System.out.println("number is less than 50");
		   }
		} else {
			if (boolValue){
				System.out.println("true condition");
				
			} else {
				System.out.println("false condition ");
			}
		}
	   }
	}
