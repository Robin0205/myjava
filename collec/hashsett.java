package collec;

import java.util.HashSet;
import java.util.Iterator;

public class hashsett {
	
	public static void main (String[]args) {
	
	HashSet<Object> hs1=new HashSet<Object>();
	
	hs1.add(1);
	hs1.add("ramesh");
	hs1.add(100);
	
	HashSet<Object> hs2=new HashSet<Object>();
	hs1.add(2);
	hs1.add("mahesh");
	hs1.add(101);
	
     hs1.addAll(hs2);
     
	
	
   Iterator	hs=hs1.iterator();
   
  
   while(hs.hasNext())
   {
	  System.out.println( hs.next());
   }
	
	
	
	
	
	}

}
