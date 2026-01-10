package javaDailySessions.javaDaySixPolymorphismSuperFinal.superExample;

public class ChildClass extends Manager {
	
	ChildClass(){
		
	}
	
	public void superExplanation() {
		super.printManager();
	}
	

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.superExplanation();
	}

}
