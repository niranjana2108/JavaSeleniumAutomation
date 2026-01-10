package javaDailySessions.javaDayFiveStaticInheritanceAggregation.inheritance;

public class Manager extends Employee{

	 int bonus=10000;  
	 
	 public void printManager(){
		
			System.out.println(" I am from printManager ");
		}
	 
	 public static void main(String args[]){  
		 
		 Manager m=new Manager();  
		 
	   System.out.println("Manager salary is:"+m.salary);  
	   System.out.println("Bonus of Manager is:"+m.bonus);  
	   m.printEmployee();
	   m.printManager();
	   
	} 
}
