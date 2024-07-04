package defaultpackage;

/*it is a special type of method
 * it is used to initialize an class variable
 * name must be same as of classname
 * it cannot contain return type
 * it is invoked during  at at the time of object creation .
 * it will execute one time for every object
 * a class  can contain any number of constructors bt should contain different signature parameters
 *  default constructor(it doesnt take an parameter/argument ) ,zero parameratized and parametarized constructors are present
 *  constructotr cahining--calling one constructor from oanother constructor is called constructor chaining
 *  this----
 *  super()----we can use super kweyword to call parent constructor in the child constructor ,whereas this can be sed within class*/


public class Constructor {


	//default or non parametarized constructor...

	int x;          //instance variables,class variables,global variables
	int y;

	Constructor()          //insatnce method
	{                       //default constructor 
		x=10;
		y=20;
		System.out.println(x+y);
	}	



	

	@SuppressWarnings("unused")	public static void main(String[] args) {        // invokes default constructor

		Constructor c1=new Constructor();
		Constructor c2=new Constructor();

		
	
	 

	//parametarized constructor


	/*	int x;
	int y;

	Constructor(int a,int b){                      //parametarized constructor 
		x=a;
		y=b;
	}	

	void dispaly() {
		System.out.println(x+y);


	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {       

		Constructor c2=new Constructor(100,200);         // invokes patrametarized constructor

		c2.dispaly();*/



	/* METHOD VS CONSTRUCOTR
	 * 
	 * 
	 * METHOD..........
	 * method name can be anything
	 * method can return a value
	 * method is used for writing logic
	 * 
	 * 
	 * CONSTRCTOR.............
	 * constructor name must be same as class
	 * constructor doesnt retuen an value
	 * automatically invoked at the time of object creation.
	 * 
	 */
}


}





























