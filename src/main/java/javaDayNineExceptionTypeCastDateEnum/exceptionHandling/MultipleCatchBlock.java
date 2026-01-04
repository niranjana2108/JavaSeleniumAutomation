package javaDayNineExceptionTypeCastDateEnum.exceptionHandling;

public class MultipleCatchBlock {  
	  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[6]=30/5;    
               }   
           catch(Exception e)  
           {  
            System.out.println("Parent Exception occurs "+e);
//            e.printStackTrace();
           }  
//               catch(ArithmeticException e)  
//                  {  
//                   System.out.println("Arithmetic Exception occurs");  
//                  }    
//               catch(ArrayIndexOutOfBoundsException e)  
//                  {  
//                   System.out.println("ArrayIndexOutOfBounds Exception occurs "+e);  
//                  }    
                          
               System.out.println("rest of the code");    
    }  
}  
