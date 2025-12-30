package javaDayEightArrayStringFiles.stringExample;

public class StringMethods {
	
	public static void main(String[] args) {
		//string concatenate
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar  
		   
		   String s1="Sachin ";  
		   String s2="Tendulkar";  
		   String s3=s1.concat(s2);  
		   System.out.println(s3);//Sachin Tendulkar
		   		   
		   //substring
		   String s4="SachinTendulkar";  
		   System.out.println(s4.substring(6));//Tendulkar  
		   System.out.println(s4.substring(0,6));//Sachin 
		   
		   //case change
		   String s5="Sachin";
		 
		   System.out.println(s5.toUpperCase());//SACHIN  
		   System.out.println(s5.toLowerCase());//sachin  
		   System.out.println(s5);//Sachin(no change in original)  
		   
		   //contains()
		   String name="what do you know about me";  
		   System.out.println(name.contains("do you know")); //true 
		   System.out.println(name.contains("about"));  //true
		   System.out.println(name.contains("hello"));  //false
		   
		   //equals()
		   String s6="Sachin";  
		   String s7="SACHIN";  
		  
		   System.out.println(s6.equals(s7));//false  
		   System.out.println(s6.equalsIgnoreCase(s7));//true
		   
		   //trim()
		   String s8="  "
		   		+ "\n"
		   		+ "Sachin ";  
		   System.out.println(s8);//  Sachin    
		   System.out.println(s8.trim());//Sachin
		   
		   //length()
		   String s9="Sachin";  
		   System.out.println(s9.length());//6  
		   
		   //replace()
		   String s10="Java is a programming language. Java is a platform. Java is an Island.";    
		   String replaceString=s10.replace("Java","Lava");//replaces all occurrences of "Java" to "Lava"    
		   System.out.println(replaceString);   
		  
		   
		   
		
	}

}
