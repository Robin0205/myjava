package defaultpackage;
/* -----------------------ACESS MODIFIERS--------------
 * Acess modifiers defines the scope of the variables and methods and classes and packages.
 * 1.public
 * 2.protected
 * 3.default
 * 4.private
 * 
 *  PRIVATE-   when private modifiers is used to variables and methods it is acessed  within  class only
 *  DEFAULT-  when default modifier is used to variables and methods it is acessed within package itself
 *  PROTECTED- when protected modifier is used to variables and methods  it is accessed within project means from one package to another package by inheritance concept
 *  to use the protected class form one calss to another class present in another packge we have to import the packege.classname then extend into the 
 *  into the main package class then all the varibales and mthods in previous packge class can be acessed here
 *  PUBLIC - it  global level acess specifier super class of all when we use the PUBLIC modifier to variable or methods or calss we can acess these stuff in anywhere.
 *  
 * 
 * 
 */

public class accessmodifier {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int a[][]= {
				{100,200} ,{300,400} , {500,600}};
		
		for (int i=0;i<a.length;i++) {
			
			
			for (int j=0;j<a[i].length;j++) {
					
				System.out.println(a[i][j]);
				
			}
			
			
		}
		
		
	
		
/*	for (int r[]:a)
		
	{
		for (int i:r)
		{
			System.out.println(i);
		}
	}
		
	}*/
		
	}
}
