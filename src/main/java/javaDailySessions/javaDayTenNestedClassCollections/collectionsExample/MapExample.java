package javaDailySessions.javaDayTenNestedClassCollections.collectionsExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

public static void main(String[] args) {  
	//key and value pair - entry. Duplicate Keys not allowed.
	
	//Method 01
    Map map=new HashMap();  
    //Adding elements to map  
    map.put(1,"Amit");  
    map.put(5,"Rahul");  
    map.put(2,"Jai");  
    map.put(6,"Amit");  
    //Traversing Map  
    Set set=map.entrySet();//Converting to Set so that we can traverse  
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
        //Converting to Map.Entry so that we can get key and value separately  
        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
    
    //Method 02
    Map<Integer,String> mapTwo=new HashMap<Integer,String>();  
    mapTwo.put(100,"Amit");  
    mapTwo.put(101,"Vijay");  
    mapTwo.put(102,"Rahul");
    System.out.println(mapTwo.keySet());
    //Elements can traverse in any order  
    for(Map.Entry m:mapTwo.entrySet()){  
     System.out.println(m.getKey()+" "+m.getValue());  
    }  
}  

}
