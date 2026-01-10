package javaDailySessions.javaDaySixPolymorphismSuperFinal.polymorphism;

public class SimpleCalculator
{
	//method overloading or static polymorphism
    int add(int a, int b)
    {
         return a+b;
    } 
    
    int add(int a,double b)
    {
         return a;
    } 
    
    int add(int a, int b,int c)  
    {
         return a+b+c;
    }
    
    int add(int a, int b, int c,int d, String g)  
    {
    	System.out.println("Text is "+g);
         return a+b+c+d;
         
    }


   public static void main(String args[])
   {
	   SimpleCalculator obj = new SimpleCalculator();
       System.out.println(obj.add(10, 20));
       System.out.println(obj.add(10, 20, 30));
       System.out.println(obj.add(10, 20, 30,40,"test"));
   }
}
