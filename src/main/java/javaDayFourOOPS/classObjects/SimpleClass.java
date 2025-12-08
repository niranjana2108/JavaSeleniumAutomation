package javaDayFourOOPS.classObjects;

public class SimpleClass {
	
	//instance variable
	int integerVariable = 10;
	String stringVariable = "Test";
	
	//method definition
	//access-modifier<Space>return-type<Space>methodName(parameterList) 
	public void printData() {
		System.out.println("Method to print instance variable "+integerVariable+" "+stringVariable);
	}

	public static void main(String[] args) {
		//object creation
		//class-name<Space>object_name<Space> = new<Space>constructor
		SimpleClass simpleClass = new SimpleClass();
		
		
		//method or function call
		//object-name.method-name
		simpleClass.printData();
		//update instance variable 
		simpleClass.stringVariable = "updated data";
		simpleClass.printData();

	}

}
