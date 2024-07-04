package oopsconcept;

//Heirarchial ingeritance//

class parent { 
	int a;
	void  display() {
		System.out.println("this ia the value of a"+a);
		
	}
}

class child1 extends parent { 
	int x;
	void  show() {
		System.out.println("this ia the value of x"+x);
	}
}	
	class child2  extends parent { 
		int y;
		void  print() {
			System.out.println("this ia the value of y"+y);
		}
	}


public class heirarchial {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 child1 objc1=new child1();
		 objc1.a=10;
		 objc1.x=20;
		 objc1.display();
		 objc1.show();
		 
		 child2 objc2=new child2();
		 objc2.a=30;
		 objc2.y=40;
		 objc2.display();
		 objc2.print();
		 
		 
         
	}

}
