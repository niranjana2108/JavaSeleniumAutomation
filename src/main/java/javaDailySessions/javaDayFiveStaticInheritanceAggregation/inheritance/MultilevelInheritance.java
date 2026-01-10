package javaDailySessions.javaDayFiveStaticInheritanceAggregation.inheritance;

public class MultilevelInheritance {
	
	int test = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammerFresher pf = new ProgrammerFresher();
		pf.printProgrammerFresher();
		
		
		MultilevelInheritance multilevelInheritance = new MultilevelInheritance();
		System.out.println(multilevelInheritance.test);
//		pf.printProgrammer();
//		pf.printEmployee();
		
	}

}
