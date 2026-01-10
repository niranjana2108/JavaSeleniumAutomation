package javaDailySessions.javaDayFiveStaticInheritanceAggregation.inheritance;

public class ProgrammerFresher extends Programmer {
	int bonus = 2000;

	public void printProgrammerFresher(){
		System.out.println(" I am from printProgrammerFresher");
	}
	
//	public void printProgrammer(){
//		System.out.println(" I am from printProgrammer - duplicate");
//	}
	
	public static void main(String args[]){
		ProgrammerFresher pf = new ProgrammerFresher();
		pf.printEmployee();
		pf.printProgrammer();
		pf.printProgrammerFresher();
		System.out.println(pf.salary);
		System.out.println(pf.bonus);
	}

}
