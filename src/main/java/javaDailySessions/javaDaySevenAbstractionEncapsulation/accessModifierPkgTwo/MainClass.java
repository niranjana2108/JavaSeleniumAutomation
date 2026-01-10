package javaDailySessions.javaDaySevenAbstractionEncapsulation.accessModifierPkgTwo;

import javaDailySessions.javaDaySevenAbstractionEncapsulation.accessModifierPkgOne.DefaultVariableClass;
import javaDailySessions.javaDaySevenAbstractionEncapsulation.accessModifierPkgOne.PrivateVariableClass;
import javaDailySessions.javaDaySevenAbstractionEncapsulation.accessModifierPkgOne.ProtectedVariableClass;
import javaDailySessions.javaDaySevenAbstractionEncapsulation.accessModifierPkgOne.PublicVariableClass;

public class MainClass {

	public static void main(String[] args) {


		PrivateVariableClass pvc = new PrivateVariableClass();
//		System.out.println(pvc.data);
//		pvc.msg();
//
		ProtectedVariableClass protectedVariableClass = new ProtectedVariableClass();
//		protectedVariableClass.msg();
//		
		DefaultVariableClass defaultVariableClass = new DefaultVariableClass();
//		defaultVariableClass.msg();
//		
		PublicVariableClass publicVariableClass = new PublicVariableClass();
		publicVariableClass.msg();
	}

}
