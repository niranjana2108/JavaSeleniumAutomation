package javaDayFiveStaticInheritanceAggregation.staticExamples;

public class StaticMethod {
	
	static int variableOne = 10;
	int variableTwo = 20;
	
	static public int cube(int x){ 
		System.out.println(variableOne);//+" "+variableTwo);
		return x*x*x;  
	}  
	
	 public int cube(){  
		 int x = 9;
		return x*x*variableOne;  
	}  

	public static void main(String args[]){ 
		
		
		System.out.println(cube(5));  
		
		StaticMethod sm = new StaticMethod();
		System.out.println(sm.cube());
		
	}  

}
