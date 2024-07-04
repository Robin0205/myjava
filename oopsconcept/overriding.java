package oopsconcept;
/*
 * --------Method overriding-------
 * Method overriding is same as of overloading 
 * to implement the overriding inheritance concept is manditory
 * to do the method overriding we have to have 2 methods in 2 calsses where we can extend one class into other by extends keyword
 * both the methods in 2 classes should have the same method name same return type same defination(paraemters like int, double)
 * this order of parametrs also should not change  bt THE BODY inside the method should be different
 * once we override the method that method only executed though we override the 1 method from parenst class
 * 
 * whereas for the METHOD overloading no 2 classes is required and no inheritance is required return type  should be anyone bt method name should be same 
 * bt based on no of parameters  jvm will decide and execute the method .
 *  
 */


class sbi {
	
	double rateofinterest() {
		
		return 12536.2;
	
	}
	
}
class axis extends sbi {
	
	double rateofinterest() {
		
		return 8;
	}
	
}
class hdfc  extends sbi{
	
	double rateofinterest() {
		
		return 10;
	}
	
}
class icic  extends sbi{
	
	double rateofinterest() {
		
		return 121074.86;
	}
	
}

public class overriding {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		axis a=new axis();
		System.out.println(a.rateofinterest());
		
		//icic i=new icic();
	//System.out.println(	i.rateofinterest());
		

	}

}
