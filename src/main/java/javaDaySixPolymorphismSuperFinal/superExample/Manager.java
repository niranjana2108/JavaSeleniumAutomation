package javaDaySixPolymorphismSuperFinal.superExample;

public class Manager extends Employee{

	 int bonus=10000;  
	 float salary = 30000;
	 
	public Manager(){
		 super(2);
		System.out.println("I am child class constructor");
		 
	 }
	 
//	 public void callingParentConstructor() {
//		 super(2);
//	// can not call super constructor in a method
//
//	 }
	 
	 
	 public void printManager(){
		 
			System.out.println(" I am from printManager");
			System.out.println("Manager Salary "+salary);
			
		}
	 
	 public void printManager2(){
		 
			System.out.println(" I am from printManager");
			System.out.println("Manager Salary "+super.salary);
		 	printManager();
			super.printManager();
		}
	 
	 
	 
	 public static void main(String args[]){  
		 
		 Manager m=new Manager();  
//	  System.out.println("Manager Salary "+super.salary);
	   System.out.println("Manager salary is:"+m.salary);  
	   System.out.println("Bonus of Manager is:"+m.bonus);  
	   m.printEmployee();
	   m.printManager2();
	   
	} 
}
