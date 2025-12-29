package javaDaySixPolymorphismSuperFinal.polymorphism;

public class ChildClass extends ParentClass {
	//method definition
	public void myMethod(){
		System.out.println("child class Method ");
	}
	public static void main(String args[]){
		//object creation
		ChildClass obj = new ChildClass();
		//method call
		obj.myMethod();

	}

}
