package javaDayEightArrayStringFiles.stringExample;

public class StringBufferExample {

	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		sb.append("test");
		System.out.println(sb);//prints Hello Java  
		} 
}
