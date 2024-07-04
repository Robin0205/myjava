package defaultpackage;

import java.util.Scanner;

public class stringbuffer {

	/*----------------------STRING BUFFER AND STRING BUILDER----------------(pre defined class)
	 *String builder and buffer are the mutable versions of java--menas we can change the values of the java object by using the methods 
	 * which are present in string buffer and builder classes which are pre defined classes in java
	 * Mainly these are used for secuity purpose.
	 * Mehods of String buffer and builder
	 * --------------------------------------
	 * Stringbuffer s1=new String("Ramesh");
	 * s1.length();
	 * S1.delete(1,3);-delete characters from 1-3 index -----Rsh---
	 * s1.deleteChatAt(2)--deleted the particular index character----m
	 * s1.substring(1);----returns the at specific index---a
	 * s1.Substring (1,3)-----returns the index from 1 to 3 ----(ame)
	 * s1.insert(6,"Ramesh  ");
	 * s1.append (6,"Ramesh  ");
	 * s1.replace(6,"Ramesh  ");
	 * s1.replcae(0,4"Ramesh ");
	 * s1.reverse();
	 *String buffer is a synchronised (1 thread) at a time ( only one can use at a time)
	 *String builder(non synchronised(many threads ) at the same time-----multipple 
	 *
	 *Literal
	 *--------
	 *String literal is a set of charachters that are enclosed in a pair of double quotes
	 *it is stored inside the heap memory ,same memory is shared for the duplicate value(same value)
	 *
	 *Non literal
	 *---------
	 *stored inside the empty space of the heap memory
	 *New memory is created for the every duplicate value(same value)
	 *
	 *where as string object is a java is a set of characters that are cretaed by using new() operator.
	 *String pool is a storage space in the java heap memory,where string literals are stored.also called (Strinf intern or constant pool)
	 *
	 * we can create the string by using the 2 ways they are String s= new String("abc")
	 * String s="Ramesh;------------bt we cannot create the String builder or string buffer  in 2 ways we can use only one way
	 * string s1=new string("Robin");
	 * Generally strings are immutable which means once we store value in string object we can not change the value
	 * in order to change the value in string object we use the string builder and buffer
	 * 
	 * 
	 * 
	 * ---------------------SWAPPING OF NUMBERS-------------------
	 * we can do the swapping by without using the third variable 
	 * 
	 */

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		/*
		 * int a =10; int b=20; int temp; //swapping of numbers with using 3 variable
		 * System.out.println("before swapping");
		 * 
		 * System.out.println("this is the value of a is"+ a +"this is the value of b"+
		 * b );
		 * 
		 * temp=a; a=b;
		 * 
		 * System.out.println("after swapping"); System.out.println("value of temp"+
		 * temp +"valus of a"+ a );
		 * 
		 */
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println(3);
		
		 int a=sc.nextInt();
		 
		 System.out.println(5);
		 
		 int b=sc.nextInt();
		 
		
		

		//int a =10;                         //swapping of numbers without using the third vaiale
		//int b =20;

		System.out.println("actual values of A  and B before swapping " + a + "-------" + b);

		a = a + b;
		b = a - b;

		a = a - b;

		System.out.println("value of b is" + b + "-------" + "value of a is" + "---------" + a);
		
	
	}

}
