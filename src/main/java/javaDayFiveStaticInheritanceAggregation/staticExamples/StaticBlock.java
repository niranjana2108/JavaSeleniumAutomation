package javaDayFiveStaticInheritanceAggregation.staticExamples;

public class StaticBlock {
	
	static int variableOne = 90;
	int variableTwo = 20;
	
	
	
	static {
		
		
		System.out.println("static block is invoked "+variableOne);
		
		}  
	
//	
	public static void main(String args[]){  
		System.out.println("Hello main");  
		StaticMethod.cube(8);
	}  

}
