package defaultpackage;

//This class consiste of variables, operators ,and java statements(conditional,loops or iterative, jump statements).
//variables are the containers that holds values
//data types are -----2 types primitive and derived (pre defined in the form of packages).

//operators(arithmetic,logical,condiotional,new,dot,bitwise,relational(comparisional),incre/decrement,assignment operator(=)

//comment in java explain java coding and increase readability and comment wont print in output.

public class Hello {
	
	@SuppressWarnings("unused")
	public static void main (String[]args) {

		/* variables....................
		int x = 10;
		double y = 20.2222;
        char c='A';
        boolean b = true;
        String s ="welcome to java";
       System.out.println(x);
       System.out.println(y);
       System.out.println(c);
       System.out.println(b);
       System.out.println(s);
		float f =12.1234556f;    //at the end of the datatype we must append with f or else it will save as a double

		/*Arithmetic operators............................

		int a = 10;
		int b = 20;
		System.out.println("sum of a and b is:"+( a+b));
		System.out.println("difference of a and b is:"+( a-b));
		System.out.println("multiplication of a and b is:"+( a*b));
		System.out.println("div of a and b is:"+( a/b));             //remainder
		System.out.println("mode of division of a and b is:"+( a%b));*/        //coffecient



		//relational or comparison operators.....................they always return the boolean values (T or F)

		/*int x= 10;
	    int y =30;
	    // System.out.println(x==y);
	    // System.out.println(x>y);
	     //System.out.println(x<y);
	     //System.out.println(x>=y);
	    // System.out.println(x<=y);
	     //System.out.println(x!=y);*/

		//logical operators...........(if we have expression like  logical then we have to undergo logical operator between two operators...)

		/*	boolean x=true;
		boolean y = false;
		 //System.out.println(x&y);
	    // System.out.println(x||y);

	    //System.out.println(!x);
	    //System.out.println(!y);*/



		//Increment or Decrement Operators............


		/* int A = 30;
	      	A+=5;    //A=A+5;
		//A++;    //A=A+1;
		System.out.println(A);
		
		 int B = 20;
		// B-= 10;
		// B--;   /B=B-1;
	     System.out.println(B);*/


		//condiotional operator
		//new operator and dot operator

		//based on expression the output code is given

		//condition?  expression1: expression2

		//int x=5 ,y=10;
		
		//System.out.println( x>y ? "x is greater than y" : "y is greater than x");

		//New operator (it is used to create new object for class)
		//to store the memeory object is created  and  object i based on class name 


		//Hello H=new Hello();

		//Dot operator
		//it is used to call calsses from pre defined packages in java or to call methods or variables(.) it refers present project directories.


		/*by the below mentioned manner we can call the calasses, methods, and variables

		classname.variable;
		classname.methodname;
		packagename.classname;*/


		//conditional statements (if else condiotion)


		/*int age= 18;       //in the condiotional statements we have to use  comparision or relational operators...




		  if ( age==18)

		  {System.out.println("age 18 is eligible for vote");
		  }
		  else
			  {System.out.println("age 20is not eligible for vote")};*/



		//loops or iterative statemnets ( while, do while, for loop,for each loop)	

		// if we want to excute the same statement multiple times based on condition then it is called loops or iterative statements


		//do while loop 

		//it doesn't verify condiiton it directly enter into the loop and execute


		/*int a=10;


	do {
		System.out.println(a);
		a++;

	}

	while(a<=100);*/
		
		
		/*    
		while loop
		---------
		 int i=2;
		
		while(i<=10);
		{
			System.out.println(i);
			i++;
		}

*/



		//for loop (we have to give 3 parameters in this loop) (initialization (assign value  to variable);condition;inc/dec operator)
		// if we would have known before how many times we should execute the same statement then we have to use for loop....

	/*	int i;

	for(  i=1;i<=100;i++)
	{
		System.out.println("hello");

	}*/



		//if we dont know how many times to execute the same statement then we should go for while loop

		/*	int i=1;

	     while(i<=10);

	    {System.out.println(i);
	     i++;
	}
	



		//jump statements


		//this statemnets can be used to jump from the executing statement or continue the statement
		//Break,continue......

		//break

		/*for(int i=1;i<=10;i++)

	{
		if(i==5)
		{break;
		}

		System.out.println(i);



	}	



	//continue


	for(int x=1;x<=10;x++)
	
	{


	if (x>=5)
	{continue;
	}


	System.out.println(x);




	}*/


		//Nested if else (this can be used if we have upto 4 conditions )


		/*	
		int day=2;

		if (day==1)
		{
			System.out.println("monday");
			}

		else if  (day==2)
		{System.out.println("tuesday");}

		else if  (day==3)
		{System.out.println("wednesday");}

		else 

		{System.out.println("invalid week number");*/




		//switch case
		// if we have more than 5 conditons then we have to go for switch case
		

/*
		int day=1;

		switch(day=8) {

		case 1:System.out.println("sunday");break;
		case 2:System.out.println("monday");break;
		case 3:System.out.println("tuesday");break;
		case 4:System.out.println("wednesday");break;
		default:System.out.println("invalid week number"); */
		 
	
	}
}


