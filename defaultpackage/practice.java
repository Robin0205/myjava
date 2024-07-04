package defaultpackage;

import oopsconcept.axis;
import oopsconcept.sbi;


	
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
	
	public class practice {
		
		public static void main(String[] args) {
			
			axis a=new axis();
			System.out.println(a.rateofinterest());
			
			//icic i=new icic();
		//System.out.println(	i.rateofinterest());
			

		}
	

}