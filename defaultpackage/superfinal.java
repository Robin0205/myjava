package defaultpackage;


/*--SUPER KEYWORD------
 * 1.Super can be used to refer immediate parent class instance variable
 * 2.super can be used to invoke immediate parent class method
 * 3.super() can be used to invoke immediate parent class constructor.
 * 
 * 
 * ------------FINAL--------
 * varibale---- you cannot change the value when we use the final keyword
 * method----you cannot change the method when we use the final keyword
 * classes----you cannot change the method when we use the final keyword
 */
class animal  {

//	String color="brown"; 
	int x=10;

	 animal( String k){                           // this is parent class constructor
        System.out.println(k);
		System.out.println("this is parent class  constructor");
	}

	  void eating(){

		System.out.println(this.x);
	  }
	}

  class animal2 extends animal {

	//	String color="black";
         int x=30;
		 animal2(){                         //this is the child class constructor
			super("ramesh");               //this will invoke parent class constructor
			System.out.println("thi is child class constructor");
		}


	     void bear(){
		System.out.println(super.x);   //we have used super so parent class varibale is executed
		System.out.println(x);     // we havent used super keyword so dat present class variable is executed though the varibale  name is name.
		  }

	}

public class superfinal {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		animal2 be=new animal2();
	     be.bear();

	}
}
/* -----------------FINAL----------
 * When we assign final to any of the variable which is holding the value we  cannnot change the values of the variable 
 * if we create method as final we cannot override that method into child class
 * if we want to share our class to aother guy  which consist of 5 methods in it without main method bt 2 of methods are final u dont want to be used by
 * him u can use the FINAL  keyword to that methods then u can share hte class.
 * 
 * 
 * the same final error is seen for class also if we use the final keyword to the parent class
 */

/*public class superandfinal {

	final  int x=30;


	 void display() {
		 System.out.println(x);

	 }

	 public static void main(String[]args) {


		 superandfinal s1=new superandfinal();
	         //s1.x=50;     //it is showing error beacuse we have given final to  variable at classes level.
	          s1.display(); // this method will print the exact value.*/


/*final class bike {

	final  void run() {
		System.out.println("this is the final method");
	}

 } 

	class honda extends bike{  //bike class is showing error beacuse we used final to the parent class called (bike)

	    void run() {           //we  have overrided this method bt as we specified final to run  method in parent calss it is not extended in child class

			System.out.println("this is the final method");
		}

	}	


	public  class superandfinal{ 
     public static void main (String[]args) {



	 }*/

















