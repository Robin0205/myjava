package defaultpackage;

/*---------------------STRING------------
 * STRING is a datatypes which is a combination of multuiple caharcters which are enclosed in a double quotes.
 * string is a index based one
 * there are few methods which we can work strings
 * 1.concat()
 * 2.char at()
 * 3.contains ()
 * 4.equals()
 * 5.equals ignore case()
 * 6.replace()
 * 7.trim()
 * 8.tolower()
 * 9.toupper()
 * 10.indexof()
 * 11.endswith()
 * 12.replace()
 */


public class strings {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//concat

		String s= "ROBIN";
		String s1="RAM";
		
		System.out.println(	s.concat(s1));
		System.out.println(s.toLowerCase());
		
	
	

		
		//trim

		String s3= "    ROBIN    ";
		System.out.println(s3.trim());

		//cahrat()

		String s4="welcome";
		System.out.println(s4.charAt(3));

		//contains

		String s5="welcome";
		System.out.println(  s5.contains("wel"));

		//equals

		String s6="welcome";
		System.out.println(  s6.equals("wlcome"));
		System.out.println(  s6.equals("welcome")); 

		//equlasignorecase

		String s7="Welcome";
		System.out.println(  s7.equalsIgnoreCase("welCome"));  

		//replace

		String s8="ROBIN";
		String s9="SHIVA";

		System.out.println( s8.replace('O', 'A'));
		System.out.println( s9.replace('V', 'R'));

	}

}
