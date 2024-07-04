package defaultpackage;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

/*-------------INTERFACE----------
* An interface in java is a blueprint of a class
* interface contains final and static variables
* interface  contains abstract methods only
* An abstract method is a method which contain defination bt not body(no business logic)
* interface supports the functionality of multiple inheritance
* we can define interface with interface keyword.
* A class extends another class, an interfacae extends another interface bt a class implements an interface
* we can create object reference for interface but we canonot instantiate interface, we can create variables bt not instanciate means (new n object name)
* cls to cls---(extends), ------interface to interface(extends)------interface to class(implements)
* to implement the methods of interface we use extends keyword.
* until and unless we can create the object for interfacae it doesnt have a memory ,we have to cretae  a object and store in a varible 
* dat object is stored in a memory. and even class also we have  to create object becasuse class and interface are the physical entity and they dont have the memory
* 
* 
* -----------MULTIPLE AND HYBRID--------
*  multiple inheritance can be done by the interface and implements keyword. implements iterface1,interface2,interface3.
*  a class can extend only one class ata a time bt whereas interface can implements multiple interfaces then extend to the class.
* 
*/

interface A {

	int a = 10; // by default variables in i interface A are static and final

	public void m1(); // Abstract method, by dafault public (so these can be accessed by any package
						
}

interface B {

	public void m3();


}

interface c extends A {
	public void m5();


}

public class interfe implements A

{

	public void m1()
	{                                        // methods in class are public by default
		System.out.println(a);
	}

	

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		interfe i = new interfe(); // instantiation----class

		i.m1();
		
		
		
     	A a1 = new interfe(); // object creation for interface
		a1.m1();
	}
}
// @SuppressWarnings("unused")
/*
 * public static void main(String[] args) { /*inter i = new inter(); //way to
 * cretae the object for the class // we can create object for class inter i
 * (variable part) = new inter (this is a instantiation part) //bt where as in
 * the interface we cannot do the instanciation i.m1(); i.m2();
 */
// A a=new interfe(); //this is the approach to cretae the interface object(for
// interface though u create the object we have to do the instancaition part
// with the classname only)
// a.m1();
// a.m2();
