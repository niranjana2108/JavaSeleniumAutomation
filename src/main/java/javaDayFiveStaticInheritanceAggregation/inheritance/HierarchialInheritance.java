package javaDayFiveStaticInheritanceAggregation.inheritance;

public class HierarchialInheritance {
	
	public int sum() {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		m.printManager();
		m.printEmployee();
		//m.sum();
		
		HierarchialInheritance h1 = new HierarchialInheritance();
		h1.sum();
		//h1.printManager();
//		m.printProgrammerFresher();
//		m.printProgrammer();
	}

}
