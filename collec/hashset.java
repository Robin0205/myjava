package collec;

import java.util.HashSet;
import java.util.Set;

/*-----------------SET------
 * it is a child interface of collection interface 
 * interface is implemented by the classes of    (hashset and linkedhashset)
 * default size is 16 indexes
 * load factor/fill ration 0.75
 * when 75%of the object fills and new object is created we can give default loadfactor also/fill ratio
 * duppicated are not allowed, insertion order order is  not preserved , nulls are  accepted
 * internally follow the hashcode concept by which insert elements into list
 * no index order so randomly arranged 
 * we can go for this concept  wehn we have more search opeartions
 * 
 * it doesnt have any specific methods it has methods of set interface.
 * 
 * 
 * --------Difference between the hashset and linked hashset---------
 * 
 * --duplicates  are not allowed                   --duplicates are not allowed
 *--insertion order not allowed                    --inseriton order allowed
 *underlying ds(hashtable)                        --underlying ds(hasg table and linked list)
 */

public class hashset {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		
		//Declared HashSet
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		
		//to read all the values from hashset
		System.out.println(set1);
		
		
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set1.addAll(set2);
		set2.add(3);
		set2.add(4);
		
		//to read all the values from hashset
		System.out.println(set2);
		
	
		
		
		
		//add all                               --unites botht sets
	set1.addAll(set2);
	System.out.println(set1);
		
		  
	//retain all                          ------------it prints only common elements between two sets
		
      set1.retainAll(set2);
    System.out.println(set1);
	  
	  
   //contains all (subset)            -           --------the elemets that are available in set2 are present in set 1 or not
       set1.containsAll(set2);
      System.out.println(set1);
	
      
      //remove all
      set1.removeAll(set2);
      System.out.println(set1);
      
	
	}
	
}
	 

		
		
	
		
		
	