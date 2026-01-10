package javaDailySessions.javaDayFiveStaticInheritanceAggregation.inheritance;

public class Programmer extends Employee{  
	 int bonus=5000;  
	 
	 public void printProgrammer(){
			System.out.println(" I am from printProgrammer");
		}
	 
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus); 
	   p.printEmployee();
	   p.printProgrammer();
	   
	}  
	}  
