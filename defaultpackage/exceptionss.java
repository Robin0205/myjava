package defaultpackage;

/* Generally there are 2 utility by which code can be executed they are like compiler,interpretor.
 * java use interpretor as a utility , java execute programe(piece of code step by step manner,then whole code at once)
 * if any error is detected in between the code it will throw exception and stops there.
 * in case of interpretor it will execute all the coded nad throw all the errors after executing all the code.
 * compiler will detect the error(like syntax error ;:""/{}) during the designing of the code only bt exception cannot be identified only, only  few exceptions are 
 * identified and throw exception and program will be terminated.
 * 
 *   //Stack trace
 *   *Exception name-java.lang.exception
 *   *Exception message-/zero
 *   *which line number
 *   *Method info
 * 
 * Try---A piece of code that throws te exception
 * catch---contains statements or solution to error
 * By clicking F3 keyword in exception keyword we can see the heirarchy of exception
 * 
 * ---------EXCEPTION IS AN EVENT THAT OCCURS DURING EXECUTION OF PROGRAM THAT DISRUPTS THE NORMAL FLOW OF INSTRUCTIONS-----------------
 * Taking the control of exception by user or programmer to handle that exception is called exception handing
 * By  using these blocks(try,catch,final} user can take control and handle the exceptions
 * becasuse by default java stops the execution if anny error occurs
 * A bunch of things can lead to exceptions,including programmer error,hardware failure, files that need to be opened cannot be found
 * Java provides a robust and object oriented way to handle exception scenario, knows as java exception handling
 * when exception occurs in a method the process of creating the exception object and handling it over to runtime environment is called "throwing exception".
 * once runtime receives the exception object, it tries to find the handler for the exception object. the handler is said to be "catching  the exception"
 * note that java exception hadnling is a framework that is used to handle runtime errors only, compile errorrs are not handled by exception handling
 * 
 * --------------Types of exceptions (checked ,unchecked exception)
 * 
 * 1.checked exception --it will show red lines that are identified by the compiler ,these are intimated by the design time only
 * examples
 * 1.Interupted exception
 * 2.IoException
 * 3.Filenotfound exception.
 * 
 * Stringbuilder se=new stringbuilder();
 *  
 * 2.unchecked exception---compiler is not able to identify these exceptions
 * examples
 * 1.Arithematic  exception             int a=500/0
 * 2.Nullpoint exception                string s= null ,sys.out.println(s.length)
 * 3.Numberformatexception               string s="abc" ,int i=integer.parseInt(s);
 * 4.Arrayindexoutofbound Exception.    int a[] =new int[5]; ,a[10]=50;
 */

/*    -------------------HANDLING EXCEPTION---------------
 * one try block can have multiple cathc blocks
 * 
 * syntax-1.   (one try block and one catch block)

 * try
 * {
 *    statement;
 * }
 * 
 * catch (exception ae)
 * 
 * catch (Aritematicexception ae)
 * {
 * sysout(Arrays.tostring(ae.getstacktrace()))         //by this method we can get stack trace detils in array format
 * we can use this also (ae.printstacktrace());
 * }
 * 
 * {sysout(ae.tostring())
0); *       statement;
 * }
 *  
 * 2.syntax-2   (one try and multiple catch blocks)
 * 
 *  try
 * {
 *    statement;
 * }
 * 
 * catch (exception types)
 *
 * {
 *      statement;
 * }
 * 
 * catch (exception types)
 *
 * {
 *     statement;
 * }
 * 
 * catch (exception types)
 *
 * {
 *        statement;
 * }
 * 
 * syntax-3
 * 
 * there are 3 cases where exception thrown by try block is handled by catch block and finally is executed if not thrown by try block then also finally
 * block is executed , if exception thrown by try block is not handled by the catch block also finally block is executed 
 * which means finally block is executed in all the 3 cases.
 * 
 *  try
 * {
 *    statement;
 * }
 * 
 * catch (exception type)
 * 
 * {
 *       statement;
 * }
 *  
 * finally (it is optional)
 * {
 * 
 * }
 * 
 * --------------CHECKED EXCEPTION can be handled by (try and catch block or else  by throws keyword)-------- 
 * Exception is a super class of all kinds of exception so, when u dont know what type of the exception the try block is throwing we can mention
 * exception in catch block.
 * 
 * if try block throws any exception then only catch block is executed or else statement in the try block is executed.
 */




//public class exceptionss {

	//@SuppressWarnings("null")
	//public static void main(String[] args) {
		//System.out.println("program  started");
		//System.out.println("program is in progress");
		
		/*int a=100;
		try {
		System.out.println(a/0);      //this will thorw (arithematic exception )and from this line onwords no execuiton of the code takes place.
		}

		catch( Exception e) {
			e.printStackTrace();
			e.getMessage();
		
		
		{
			System.out.println("entered intop catch block");

		}


	/*	String s= null;
		
		System.out.println(s.length()); 
		try {
			System.out.println(s.length());      //this will throw nullpoint exception
		}
		catch(Exception e) {
			
		
			System.out.println("entered into catch block");
		}*/


		//String s="abc";                    //this will throw numberformat exception
		//int i=Integer.parseInt(s);
		//System.out.println(i);



	/*	int a[]=new int[5];                   //this will throw arrayoutofbound exception
		a[10]=50;
		System.out.println(a[10]);



		System.out.println("program is  completed");
		System.out.println("program is exited");*/
public class exceptionss{

public static void main (String[]args) throws ArithmeticException {
	System.out.println("hello");
     System.out.println("1/0");
     System.out.println("world");

}
}
