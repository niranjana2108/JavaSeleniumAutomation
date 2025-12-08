package javaDayFourOOPS.classObjects;

public class CreatingObjects {
	
	public void printData() {
		System.out.println("calling print data method");
	}

	public static void main(String[] args) {
	// by creating anonymous object
		new CreatingObjects().printData();
		
	//creating multiple object
		CreatingObjects co1 = new CreatingObjects(),
				co2 = new CreatingObjects();
		co1.printData();
		co2.printData();
		
	//creating single object
		CreatingObjects co3 = new CreatingObjects();	
		co3.printData();
		CreatingObjects co4 = new CreatingObjects();	
		co4.printData();
	}

}
