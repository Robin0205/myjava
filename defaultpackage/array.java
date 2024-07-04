package defaultpackage;

public class array {
	

		//Array is a variable that holds a collection of elements of same data type.

		// 2 types of arrays
		// single (only one row and one colum) and in  double dimesional array(we have both rows and colums ---int a[][]=new int[3][2] 3--rows, 2--colums.
		//duplicates are  allowed in array

		//Declare an array , insert values into array, find size of an array,read values from an array.....
		//Declare Array int a[]=new int[5]   (or)   int []a=new int[5]  //when u give size ten the num of locations are created based on index num from 0 ..(n-1)



		
		//public static void main(String[] args) {
			//int a[]=new int[5];  //declared an array starting with  index 0 and end with 4 ,this is fixed array

			//storing or insert values into array 
			/*a[0]=100;
			a[1]=200;	
			a[2]=300;
			a[3]=400;
			a[4]=500;

		System.out.println(a.length);       //it will print the size of the array
	   /system.out.println(a[2]); */         // to read te specific value from array 



			//int i[]= {100,200,300,400,500}	;  //declaring an array without specifying size

			//i<=4  //i<a.length-1
			//i<5    //i<=a.length-1
			//System.out.println(b[2]); // to read te specific value from array 

			// read the vales from array using (forloop)
			/*for(int i=0;i<=b.length-1;i++)
			 * {
			 * system.out.println(b[i]);
			 * }
			 *

		System.out.println(b[i]); */

			//Advcanced for loop/enhanced for loop/for each loop(readin values from array using for each loop)
			// this loop is specially designed for arrays list and hashmap concepts

			//for(int i:a)
			//	System.out.println(i);



			//TWO dimensional array

			/*int i[][]=new int [3][2];     //declaring an array with specifying size(fixed)
			i[0][0]= 100;
			i[0][1]= 200;

			i[1][0]= 300;
			i[1][1]= 400;
			
			i[2][0]= 500;
			i[2][1]= 600;*/



			//int a[][]= {{100,200},{300,400},{500,600}}; //declaring array without specifying size (not fixed)

			//System.out.println(a.length);        //rows
			//System.out.println(a[0].length);    //colums   here 0 indicates the index number of colums it will give the number of coulms present in row.
			//System.out.println(a[1][0]);



			//reading values from array using for loop


			/*for(int i=0;i<a.length;i++)    //outrt loop   0 1
		{ 
			for(int j=0;j<a[i].length;j++)   //inner loop 0 1 2
			{
				System.out.println(a[i][j]);
			}*/

			//read values from array by using for each loop

			/*for(int r[]:a)
				
			{ for(int i:r)

			{System.out.println(i);

			}
			}
		}
		
		Reading values of Array from Ascending and Descending order 
		
		int b[] = { 100, 200, 300, 400, 500 }; // declaring an array without specifying size
		// 0 1 2 3 4

		System.out.println(b.length);

		System.out.println("Reading the vales of Array in Descending order");

		for (int i = b.length-1 ; i >= 0; i--) // i=3+1=4
		{
			System.out.println(b[i]);

		}

		System.out.println("Reading the vales of Array in Ascending order");

		for (int i = 0; i <= b.length-1; i++) // i=3+1=4
		{
			System.out.println(b[i]);

		}

	}*/

}














