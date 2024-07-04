package collec;

import java.util.HashMap;

/*----------------------MAP----------------
 * it is  child interface of collection interface , it is implemented by (hashmap  and hashmap table classes)  
 * 
 * we can represent the data in form of object (key, value)
 * there are some rules to follow in this interface they are
 * when we represent data in object format keys should not be duplicate bt values can be duplictaed.
 *  
 *  --in hashmap entry(i) is a sub interface of map. with dat entry we can insert data in form of entryset
 *  --entry ,means collection of combination of keys and values
 *  combination of key and value is called pair or dataset
 *  every key associated with one value
 *  we have to use this concept when we have more search opeartions.
 *  
 *  
 *  
 *  in hashmap ,underlying data structure is hashtable
 *  insertion order --no
 *  duplicates--not allowed
 *  duplicate values-no
 *  duplicates keys-yes
 *  nul keys allowed "once"
 *  null values "multiple"
 *  
 *  
 *
 */

public class mapp {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) {
		
	    HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(101, "x");
		h.put(102, "y");
		h.put(103, "z");
		h.put(101, "a");
		
	 // System.out.println(h);
	  
	  
		
		HashMap<Integer,String> h2=new HashMap<Integer,String>();
		h2.put(104, "john");
		h2.put(105, "merry");
		h2.put(107, "david");
		h2.put(108, "duko");
		h2.put(108, "");
		
	//  System.out.println(h2);
    h.putAll(h2);
	//System.out.println(h);
	
	// these all are the implemented  methods of the hashmap calss
		//retian value by key
	  System.out.println	(h2.get(104));
	

     
     
    //retain all the values by valyue method 
     System.out.println(  h2.values());
     
     
     
     //is empty method
  System.out.println(h2.isEmpty());  
  
  
System.out.println( h2.containsValue("ramesh"));



	  //return all the keys
	System.out.println(  h.keySet());
	
	
	
		
 
		
		
		
	}

}
