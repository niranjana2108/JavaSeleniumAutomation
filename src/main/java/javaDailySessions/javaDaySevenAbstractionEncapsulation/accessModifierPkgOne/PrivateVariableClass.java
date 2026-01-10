package javaDailySessions.javaDaySevenAbstractionEncapsulation.accessModifierPkgOne;

public class PrivateVariableClass {

	private int data=40;  
	private void msg(){
		System.out.println("Hello java"+data);
		}  
	
	public static void main(String args[]) {
		PrivateVariableClass pvc = new PrivateVariableClass();
		pvc.msg();
		System.out.println(pvc.data);
	}
}
