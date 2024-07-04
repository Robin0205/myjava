package oopsconcept;

/* -----------MULTIPLE AND HYBRID INHERITANCE --------
 * 
*  multiple inheritance can be done by the interface and implements keyword. implements iterface1,interface2,interface3.
*  a class can extend only one calss at a time bt whereas interface can implements multiple interfaces then extend to the class.
*  multi interfaces and one class nad when we craete another class we can extned previous class 
*  when we create object for the previious class it will execute everything dat is related to previous class here duplication of the methods in the
*  present class is avoided.
*

 //-----------------------muliple inheritance---------
/*interface A
{
	int x=10;
	void m1();
	
}

interface B
{
	int y=20;
	void m1();
	
}
interface C
{
	int z=30;
	void m1();
	
}


public class multipleinter implements A,B,C {
	
	
public	void m1(){
	{
		System.out.println(x);
		
	}
}

public	void m2(){
{
	System.out.println(y);
	
}
}
public	void m3()
{
{
	System.out.println(z);
	
}

}	


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*multipleinter multi= new multipleinter();
		multi.m1();
		multi.m2();
		multi.m3();*/
		
  
	  /*---------------HYBRID INHERITANCE---------------(1 parent --multi child (multi child are parents to the child of next class ) child)
         hybrid is the combination of the heirarchial and multiple inheritance.
         in hybrid inheritance concept(one class 2 interfaces and one class)
         Hybrid is the combination of both the class and interfaces we can use the two  keyword extends and implemensts.(heirarchial and multiple)
         
      */



interface i1{                //parent =1
	
	int y=20;
  void print1();
	
}	

interface i2{
	                                 //parent=2
	int z=502;
	void print2();
	
}	
interface i3{
    //parent=2
int s=500;
void print2();

}	
interface i4{
    //parent=2
int r=400;
void print2();

}	
interface i5{
    //parent=2
int t=30100;
void print2();

}	



public class multipleinter implements i1,i2,i3,i4,i5 {                //child
	
	public void print1() {
		
		
		System.out.println(y);
		System.out.println("this is the interface method1");
	}
	
	
	public void print2() {

		 System.out.println(z);
		 System.out.println("this is the interface method2");
		
	}



@SuppressWarnings("unused")
public static void main(String []args) {
	 
 multipleinter m=new multipleinter();
 m.print1();
 m.print2();

 
}
}


