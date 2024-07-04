package oopsconcept;

/*        -------Inheritance----(single and multilevel)
 * 
 *  inheritance is the process of acquring data from one class to another class then it is called inheritance concept
 *  EXTENDS is  a kewyword used to call (parent,super,base) class to (child,sub,derived) class.
 *  In the same package we should not use the same class name when  we use the inheritance concept...
 *  
 *  There are 5 types of inheritance (Classes and extends)
 *  1.single level ---one parent and one child
 *  2.multilevel-one parent(1)----child1(parent-2)this child will become parent to next child bt it is the child to main parent-----child2.
 *  3.multiple--------2 parent  classes and once child calsses(interface, implements)--more than 2 parent classes supports parallely into child class
 *  4.Heirarchial--------one parent and multiple child classes
 *  5.hybrid---------combination of both multiple and heirarchial (parent---multiple child  from this multiple child classes
 *   we can define one child classe)
 *  (combination of multiple and single).
*/
 class A {
 
	int a=10;                            //PARENT                 //Parent
	void display() {
		
		System.out.println(a);
	
	}
	
 }
		
class B extends A
	  {
		
	int b=20;
		void print() {                              //CHILD-1            //Parent
			System.out.println(b);
		}
	  }

class c extends B
{
	int c=30;                                    //CHILD-2              //child
	void show() {
		System.out.println(c);
	}
	
}

class d extends c
{
	String d="40";
	void visible() {
		System.out.println(d);
	}
	
}

public class inheritance {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		d obb=new d();  
		obb.display();
		obb.visible();
		obb.show();
	    obb.print();
		
		
		
		
	}
}