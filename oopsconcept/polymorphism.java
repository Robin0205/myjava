package oopsconcept;

//the main purpose of oops is reusability of exisated class and methods to reduce the time for the development of web applications.

/*POLYMORPHISM
 * 
 * If a single  entity that shows the multiple  forms or behaviour then it is said to be polymorphism it is a concept in oops
 *  we can appoach this by  method overloading and overiding..
 *  
 *  polymorphim concept can be approached by 2 methods overloading and riding
 *  
 *  COMPILER TIME POLYMORPHISM (method overlaoding)
 *  if the polymorphic nature of an entity is decide by thte compiler during the compilation time then it is called CTR
 *  
 *  RUNTIME POLYMORPHISM (method overriding)
 *  if the polymorphic nature of the entity is shown by the jvm during the run time then it is called runtime polymorphism.
 *  
 *  
 *  METHOD OVERLOADING.......( on constuctors and methods)  ,to save time and memory location..
 *   The process of specifying multiple methods with different signaures having the same method is called overloading
 *       signatures(num of parameters,type of parameters,order of parameters)
 *       compiler will call the method depend on the number of parameters
 *      retun type be same or different
 *      it is also called static or early binding
 *      it is applicable to instance,static,main constructor  method...
 *      we can overload main methods also bt syntax should be different 
 *      order of creation of methods is nt so important bt the execution is always start from default main method only
 */

public class polymorphism {
	
void add (int x,int y) {
		
	System.out.println(x+y)	;
}

void add (int x , int y ,int z)
{
System.out.println(x+y+z)	;
}

void add (int c,double a)
{
	System.out.println(c+a)	;
	
}
void add (double a ,double b)
{
	System.out.println(a+b)	;
	
}

@SuppressWarnings("unused")
public static void main(String[]args) {
	
	polymorphism poly=new polymorphism() ;
	
        poly.add(30,20.36);
		
	
	
/*	public void main(int x,int y)
	{
		System.out.println(x+y);
	}
	
	public void main(double x,int y)
	{
		System.out.println(x+y);
	}
	
	@SuppressWarnings("unused")
	public static void main (String[]args) {
		
		polymorphism pol=new polymorphism(); 
		 
		pol.main(100,200 );
		pol.main(203.23,100);*/
		
	}

	
	
}


		
	
	










	


		
		
		
		
	


