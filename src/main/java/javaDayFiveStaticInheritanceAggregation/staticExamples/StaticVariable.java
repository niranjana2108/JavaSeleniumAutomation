package javaDayFiveStaticInheritanceAggregation.staticExamples;

public class StaticVariable {
	
	static int count=0;//will get memory only once and retain its value  
	int countNoStatic=0;//will get memory each time when the instance is created 
	  
	StaticVariable(){  
	count++;//incrementing the value of static variable 
	countNoStatic++;
	System.out.println("Static value "+count+"\nNon static value "+countNoStatic);  
	}  
	  
	public static void main(String args[]){  
	//creating objects  
	StaticVariable c1=new StaticVariable(); 
	StaticVariable c2=new StaticVariable();
	StaticVariable c3=new StaticVariable();  
	}  

}
