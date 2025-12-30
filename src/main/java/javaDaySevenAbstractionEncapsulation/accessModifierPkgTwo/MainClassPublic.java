package javaDaySevenAbstractionEncapsulation.accessModifierPkgTwo;

import javaDaySevenAbstractionEncapsulation.accessModifierPkgOne.PublicVariableClass;

public class MainClassPublic extends PublicVariableClass{

	public static void main(String[] args) {

		MainClassPublic publicVariableClass = new MainClassPublic();
		publicVariableClass.msg();
	}

}
