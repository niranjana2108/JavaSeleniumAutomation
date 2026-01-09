package javaDayTenNestedClassCollections.collectionsExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String args[]) {
		//array example
		int arr2[]= {1,2,3,4};
		int arr[] = new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
		for(int number : arr) {
			System.out.println("Value is "+number);
		}
		System.out.println(arr[1]);
		
		//arrayList - The ArrayList class implements the List interface
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(2);
		arrayList.add(34);
		
		for(int number : arrayList) {
			System.out.println("Value is "+number);
		}
		
		System.out.println("Size "+arrayList.size());
		arrayList.add(34);
		for(int number : arrayList) {
			System.out.println("Value is "+number);
		}
		
		System.out.println("To print a value in index 1 "+arrayList.get(1));
		
		arrayList.remove(1);
		
		Iterator itr=arrayList.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		
		
	}

}
