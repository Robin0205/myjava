package oopsconcept;

/*STATIC KEYWORD  is used to save the memory and replacement of  values to varaibles everytime .
 * when we give static kaeyword to variable at class level same  variables with the same value can be shared to entire class and when we modify value of variable 
 * it changes among the entire objects that we have created in class level.
 *  we can change the varible level also if we modify  static variable at object level it will change in all objects because it is sattic variable
 *  this static variable will create separate location in memory.
 *  
 *  STATIC KEYWORD IS APPPICABLE TO  VARIABLES AND MEHTODS.-
 *   
 *   
 *   static method can access only static stuff(static variables) directly access, without creaing objects.
 *   
 *    ----------------SYSTEM.OUT.PRINTLN-------
 *     
 *     in java, system is a predefined class in dat out is a variable and printstream is a variable type(in dat many methods are there 
 *   and it is a static varibale so dat we have to call this out variable by classname and methods present in printstream
 *   
 *    
 *   class test
 *   {
 *   static string s="welcome"
 *   }
 *   test.s.length
 *   
 *   class.sytsem
 *   {
 *   static printstream.out
 *   }
 *   
 *   system.out.println("testing");         //print output one by one 
 *   system.out.print("testing");         //print output one by side by side
 *   
 */

public  class staticandnonstatic {

	static int x = 10; // static variable
	int y = 20; // non static vriable

	@SuppressWarnings({ "unused", "static-access" }) // static method
	static void m1() {
		
		System.out.println(x);
		System.out.println("this is m1 static method");
	}

	void m2() {
		System.out.println("this is m2 non sttaic method"); // non static method
	}

	void m3() {
		System.out.println("this is m3 non sttaic method");
		System.out.println(x);
		System.out.println(y);
		m2();
		m1();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 System.out.println(staticandnonstatic.x);
		staticandnonstatic.m1(); // static method without creating object
		staticandnonstatic st = new staticandnonstatic(); // non static methods can acess by creating objects
		System.out.println(st.y);
		st.m3();
	     st.m2();
		m1();

	}
}
