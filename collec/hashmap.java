package collec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* -------------------methods of hashmap------------
* m.put(key,value)
* m.putall(map m1)
* into hashmap---m.get(key)--retuen value
* m.contains(key)---t
* m.isempty()   m.clear()   m.size()
* 
*  for entryset---m.entryset()--set--retaiins all keys
*  for collection m.vales()
*  m.entryset()
*  101 x
*  102 y
*  103 z
*  
* map is the collection of entries
* 
* -----------------------converiton  map into set---------------------------
* set<integer,student> se=s.entryset();
* 
* for(entry<integer,student>a:se)
* {
* s.o.p+a.getvalue().getname()
* s.o.p+a.getname().getphone()
* }
* 
* methods of sub interface entry(I)----
*e.getkeys()
*e.getvalue()
*e.setvalue(object)
*/

public class hashmap {

	@SuppressWarnings({ "unlikely-arg-type", "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		
		  HashMap<Integer,String> h=new HashMap<Integer,String>();
		  
			h.put(101, "x");
			h.put(102, "y");
			h.put(103, "z");
			h.put(101, "a");
			
		 // System.out.println(h);
			
			
		  
			
		/*	HashMap h2=new HashMap();
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
	/*	  System.out.println	(h2.get(104));
		

	     
	     
	    //retain all the values by valyue method 
	     System.out.println(  h2.values());
	     
	     
	     
	     //is empty method
	  System.out.println(h2.isEmpty());  
	  
	  
	System.out.println( h2.containsValue("ramesh"));



		  //return all the keys
		System.out.println(  h.keySet());
		
		//remove
     System.out.println(h.remove(107)); */
     
	    
	    
	    // methods to return all the entries by  entryset
     
          //  h.entrySet();
	    
	    
	    //to read data form hashmap by using looping statements(individually).
	    
	    
  // System.out.println(h.keySet());
	/*	Integer i = null;
	 
 for (  Integer i1:h.keySet());
	 {
		 System.out.println(i1);
	 }
	 
	 
     // System.out.println( h.values());  
      
      /* for (Object i:h.values());
 	 {
 		 System.out.println(i);
 	 }
 	 */
	    
	/* for (Object i:h.keySet());
	 {
		 System.out.println(i+"    "+h.get(i));
	 }
	    
	    */
	    
      
  
      
      
      /*--------------ENTRY INTERFACE --------------
       * ENTRY interface  is  a chid interface of map interface 
       * entry set is a combination of key and value 
       * we have some specila methods of entry set interface if we want to work with the  entry sets 
       * we can use dat methods only on  collection "entry"
       * ENTRY interface is present inside the map interface 
       * in the entry interface there are special methods like e.getvalue();  , e.getkey();  this 2 methods will return 
       * the  keys and values of the partiular entry.
       * 
       */

   
			 //reading values by entry method
			
			
 //  for(Map.Entry entry: h.entrySet());   
   /* when we use object as hashmap h = new hash,ap(); --this object will treat every element as a obejct(both keys and vales ), 
   bt when u create hashmap<integer,string>();----it acccepts keys as int and vales as string 
   */
   
		/*	for(Map.Entry entry: h.entrySet());  {
				
				System.out.println(entry.getkey()+"      "+entry.getvalue());
			}
   {*/
			
			
			//iterator
			
	Set	s=h.entrySet();
	
	Iterator itr=s.iterator();
	
	
	while(itr.hasNext()) {
		
		
		Map.Entry	entry=(Entry) itr.next();
    System.out.println(entry.getKey()+"  "+entry.getValue());
			
	}	
	     
 
	    //by using for loop we are reading the data from the object
	    
	    /*when ur saying h.keyset it is returning all the keys in the object and  it is returned in the set format so reteurn type is "SET"
	     * in the same manner when ur using  method  values it is returning all the values are returned so return type is collection.
	     * 
	     */
	    
	    
	  
	  
		
}			
	 
}