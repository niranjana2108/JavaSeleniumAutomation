package javaDayThreeControlStatements.loops;

public class ForLoopExample {
    public static void main(String args[]){
    	//Remember to comment out the block that you do not want to use
       // finite loop 
    	for(int i=10; i>1; i--){
//              System.out.println("The value of i is: "+i);
         }
    	//infinite loop
//    	for(int i=1; i>=1; i++){
//            System.out.println("The value of i is: "+i);
//       }
    	
    	//arrays
    	int arr[]={2,11,45,9};
//    	System.out.println(arr[0]);
//   	
    	for(int i = 0;i<arr.length;i++)
    	{
//			System.out.println("i "+i);
//    		System.out.println("array value "+arr[i]);
    	}
//      
    	for (int num : arr) {
           System.out.println(num);
        }
//        //enhanced for loop
        String arr1[]={"hi","hello","bye"};
        for (String str : arr1) {
                 System.out.println(str);

    }
        

        
   }
}
