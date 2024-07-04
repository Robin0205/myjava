package defaultpackage;

/* -------------PACKAGE-----------
 * package is a collection of classes it is a blue print of classes
 * to use the class  A in package1 to package2 , then we have to write code like (import.package1.A) then we can extend that  class
 * we can create sub package by name (main package.subpackage name)
 * we can create separate classes in main and sub packages.
 * in real time projects the packages names are like com.package name,projectname.pakcage,companyname.package
 * 
 * generally packages are of 2 types 1.BUILD IN TYPE PACKAGE (pre-defined packages) 2.user defined packages (created by user).
 */

public class packages {
 static int	i=10;

	public static void main(String[] args) {
		
		//packages p=new packages();
		
		System.out.println(packages.i);


	}

}
