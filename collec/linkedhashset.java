package collec;

import java.util.LinkedHashSet;

/*-------------------LINKED HASHSET--------------
 * it is a class which implemented the set interface
 * intial size of the object is 16 and load factor is 0.75 by default
 * duplicates are not allowed
 * insertion order is preserved (this is main difference between the hashset and linked hashset)
 * underlying data structure is hashtable +linked list)

 */

public class linkedhashset {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		
		LinkedHashSet l=new LinkedHashSet();
		l.add(1);
		l.add("ramesh");
		l.add(0.75);
	
		l.add(true);
		System.out.println(l);
		
		
		

		LinkedHashSet l2=new LinkedHashSet();
		l.add(6);
		l.add("ramesh");
		l.add(0.36);
		
		l.add(false);
		System.out.println(l);
		
		
		
	//add all	
		
	//System.out.println(l.addAll(l2));
	//System.out.println(l);
	
	
	//contains all
	//System.out.println(l.containsAll(l2));
	//System.out.println(l);
	
	
	//retain all
	l.retainAll(l2);
	System.out.println(l);
	
	
	//remove all
    l.removeAll(l2);
    System.out.println(l);
	
		
		
		
		
		
	

	}

}
