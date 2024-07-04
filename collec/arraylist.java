package collec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*/*1.LIST interface can be used to insert the elements or objects in a sorted way inside, duplicates are allowed.
--- these are different classes that implemented list interface(array list, linked list, (vector,stack are  legacy calss means old one)
 -- in list insertion order preserved
---duplicates are also allowed
---null values are allowed
the methods that are present in the collection interface are also present in list interface

-                       ------METHODS-------

1.add (object0)  , add(index ,object) //singel object ading
2.add all (collection c)       //to add group of objects
3.remove(object 0)
4.remove all(collection c)
5.retain all(collection c) except this group remaining all are removed
6.clear()7.is empty() 8.size() 9.contains(object) 10.contains all(collection c) 11.to array(collection c)
12.collections.sort(al--reference variable); ---to do soritng same types of dattatypes should be present
13.collections.shuffle()----shuffle all theobjects in arraylist
14.by default 10 locations are allocated in arraylist
15.in arraylist soon after the completion of the indexes filling new object is created with the 11 index and the object is refering to new object reference
varibale and old is is sent for collection garbage 
16.when u insert any element in middle like al.add(6)  shifting of elemets will takes to next , it will work when u give index num or else it will add at the end of the arraylist object
 */

public class arraylist {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {

		//creation of heterogenous arraylist
		//decalring arraylist
/*

		ArrayList al=new ArrayList();
		al.add(100);
		al.add("ramesh");
		al.add(true);
		al.add(102.36);
		al.add(2,"python");



		//different methods of  arraylist

	System.out.println(	al.size());
	System.out.println(	al.contains(3));
	System.out.println(	al.isEmpty());
	System.out.println(al.get(4));
	System.out.println(al.set(0, 100));
	System.out.println(al.remove(1));


	//methods of collection 

	Collections.sort(al);
	Collections.shuffle(al);


		//differen methods to read from arraylist

		// for loop


		for (int i=0;i<al.size();i++)

		{
			System.out.println(al.get(i));
		} 

		// for each loop

		for (Object e:al)
		{
			System.out.println(e);
		} 

		//iterator method

		Iterator it=al.iterator();

		while (it.hasNext())           //this statement will verify the value is present in arraylist or not
		{
			System.out.println(it.next());    //automatically print the element and move to next element.
		}



		//creation of heterogenous arraylist

		ArrayList <Integer> al1=new ArrayList<Integer>();            //int tytpe of arraylist(homo)
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);

		System.out.println(al1.size());


		ArrayList <Integer> al2=new ArrayList<Integer>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(500);
		al2.add(600);
		al2.add(900);



		System.out.println(al2.addAll(al1));
		System.out.println(al2.size());







		//changing array to arraylist
		 * 
		 *
		 * 
		 
        /creation of string array without declaring size-------indirect array
         
		String[] ar3= {"dog","cat","elephant","rat"};

		for(String al5:ar3)
		{
			System.out.println(al5);
		} 

		ArrayList ar=new ArrayList(Arrays.asList(ar3));



		System.out.println(ar.get(2));

	}*/
	}
}








