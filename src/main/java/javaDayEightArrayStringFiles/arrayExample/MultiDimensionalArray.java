package javaDayEightArrayStringFiles.arrayExample;

public class MultiDimensionalArray {
	
	public static void main(String args[]){  
		//declaring and initializing 2D array  
		int arr[][]={{1,2,3},{2,4,8},{4,4,5}};  
		
		int ar[][] = new int[3][2];
		
		ar[0][0] = 7;
		ar[1][0]=9;
		//printing 2D array  
		for(int i=0;i<3;i++){ 
			
		 for(int j=0;j<3;j++){  
			 
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
		}
	
	

}
