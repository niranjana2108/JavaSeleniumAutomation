package javaDailySessions.javaDaySevenAbstractionEncapsulation.accessModifierPkgOne;

public class MainClass {

	public static void main(String[] args) {


		PrivateVariableClass pvc = new PrivateVariableClass();
//		System.out.println(pvc.data);
//		pvc.msg();

		ProtectedVariableClass protectedVariableClass = new ProtectedVariableClass();
		protectedVariableClass.msg();
		
		DefaultVariableClass defaultVariableClass = new DefaultVariableClass();
		defaultVariableClass.msg();
		
		PublicVariableClass publicVariableClass = new PublicVariableClass();
		publicVariableClass.msg();
	}

}
