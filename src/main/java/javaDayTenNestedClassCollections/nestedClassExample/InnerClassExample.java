package javaDayTenNestedClassCollections.nestedClassExample;

public class InnerClassExample {

	private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
		 InnerClassExample obj=new InnerClassExample();  
		 Inner in=obj.new Inner();
	  in.msg();  
	 }  
}
