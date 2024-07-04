package collec;

import java.util.Collections;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

/* ----------------LINKED LIST-------------
*  linked list a=new linked list();-hetero data
*  linked <integer>=new linked list<integer>();---homo
*  in linked list every object or element is called node(that has 3 parts)
*  
*  

 1.adress of previous elemet 2.index3.adress of next element
  when u add new element to linked list old connection is got lost and it will linked to the new element
   
 same as like arraylist insertion order is preserved,duplicates are allowed, nulls are allowed, default size is 10
 --same object creation is as like same of arraylist
 --objects are created randomly bt object element is linked with the previous element
 --when u call get(100) object it will check from the first element adress until it reaches  100 object
 
 --linked list has the same methods of collection interface methods
 --list is extended from collection interface and implemented  by using array and liked list
 --linked list also implemented some other methods that are coming from deque interface it has extended from queue interface.
 
 
 --linked list  has some special methods that are used to develop and work  stock and queue
 stack principle is filo(it is a stack concept)
 queue concept is (fifo)
 linked list follow the doobly data structure that read data from liked list 
 when we have prior to prefer processing we will follow this concpet
 
 
 addfirst(ob)
 addlast(ob)
 getfirst(ob)
 getlast(ob)
 removefirst(ob)
 removelast(ob)
 
 
 //---------------Difference between Arraylist and linked list----------
  * 
  * when u have more insertion and deletion  for linkedlist
  * when u have more retriving elements u go for arraylist
 
*/

public class linkedlist {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//Declared Linked List
		//LinkedList l=new Linked List();
		//Linked List <string>l2=new Linked List<string>();
		LinkedList l=new LinkedList();
		l.add(100);
		l.add("neethu");
		l.add(100);
		l.add("robin");
		l.add(100.23);
		l.add(null);
		
		
		//l.addFirst("ramesh");
		//l.addLast(12);
		//l.getfirst();
		//l.getlast();
		//l.removeFirst();
		//l.removeLat();
		
		


		//different methods of  linkedlist

  /* System.out.println(	l.size());
	System.out.println(	l.contains(3));
	System.out.println(	l.isEmpty());
	System.out.println(l.get(4));
	System.out.println(l.set(0, 100));
	System.out.println(l.remove(1));
	System.out.println(l.size()); */


	//methods of collection 
/*
	 Collections.sort(l);
     Collections.shuffle(l); */


		//differen methods to read from linkedlist

		// for loop


	/*	for (int i=0;i<l.size();i++)

		{
			System.out.println(l.get(i));
		} 
		

		// for each loop

		for (Object e:l)
		{
			System.out.println(e);
		} 

		//iterator method

		java.util.Iterator it=l.iterator();

		while (it.hasNext())           //this statement will verify the value is present in arraylist or not
		{
			System.out.println(it.next());    //automatically print the element and move to next element.
		}
		
		*/

            

		//creation of homodenous linkedlist
/*
		LinkedList<Integer> l2=new LinkedList<Integer>();            //int tytpe of linkedlist(homo)
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);

	 //  System.out.println(l2.size()); 


		LinkedList<Integer> l3=new LinkedList<Integer>();
		l3.add(100);
		l3.add(200);
		l3.add(300);
		l3.add(400);
		l3.add(500);
		l3.add(600);
		l3.add(900);



		System.out.println(l3.addAll(l2));
		System.out.println(l3);  */


	}

	
	}


