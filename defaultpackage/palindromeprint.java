package defaultpackage;

import java.util.Scanner;

/*-----------------Palidrome number----------
 * A palindrome number is a number that is same after reverse.

 */

public class palindromeprint {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		/* Reverse a String by uisng this method


		 Scanner sc=new Scanner (System.in);
		 System.out.println("enter your num here"); 
		 String sentence =sc.next();

		 // char letter[]=sentence.toCharArray();


	 System.out.println(letter.length); //this will print in the same order

		  for(int i=letter.length-1;i>=0;i--)
		 {

		  System.out.print(letter[i]); 
		  sc.close();
		 }*/


		// Reverse a number by using 3 methods

		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");

		int num = sc.nextInt();  //1234

		// 1.using Algorithm

		int rev = 0;
		while (num != 0)

		{
			rev = rev * 10 + num % 10;   //0+1234%10=4   40+3=43  430+2=432   4320+1=4321
			num = num / 10;             // 1234/10=123   123/10=12  12/10=1  1/10=0

		}

		System.out.println("Reverse number is:" + rev);

		sc.close(); */


		//using string busffer class

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();

		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
			StringBuffer rev = sb.reverse();

			if(rev==sb)
			{
				System.out.println("given number is palindrome");
			}
			else
			{
				System.out.println("given number is not a palindrome");
			}*/

		//using StringBuilder class

		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder	rev =sb1.reverse();
		System.out.println("Reverse num is :"+rev);


	}
}
