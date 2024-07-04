package defaultpackage;



/*------------------JAVA--------------------
 * java is a hihg level programming language
 * it i s a object oriented, class based,concurent,secure and general purpose programming language
 * it is a platform independent 
 * it is used to develop mobile apps,desktop apps,games,and much more
 * 4 editons of java are there they are JAVA EE, JAVA SE,JAVA FX JAVAEE.  

 * java , c++ is object oriented prigramming language whereas c ,visualbasic they are structured oriented programms.
 * we need class to write even a single code also thats y java is a object oriented programming language (class and object are basic entity)
 * 
 *---------class(logical entity)------- class is a collection of variables and methods, whereas objects are(physical entity)
 *A class is considered as a plan or model or blueprint for creating object
 *  objects(physical entity) contain  variables(poperties) and methods(actions).
 *  properties are the data or information which is represented in form of varibales
 *  actions are the tasks or operations that are done by objects represented by methods
 *  object is a instance of class.
 *  method is a block of code which contains the logic
 *  methods may return or maynot retuen values may take pr maynot take parameters.
 *  As classes canonot communicate with themselves so we need objects to do so.
 *  when we create class wid main method we can not share dat class to another person becasuse due to main method in class it become main class...
 *  *Java is a widely used object-oriented programming language and software platform that runs on billions of devices, including notebook
 * computers, mobile devices, gaming consoles, medical devices and many others. 
 *The rules and syntax of Java are based on the C and C++ languages.
 *it is a high level programming language,java is simple, high level, platform-independent,multithread,robust,dynamic in nature
 *object oriented programming languagec
 *java has its own software-based platform called jvm which executes the programms.
 *java has rules and syntaxes of c and c++
 */

public class clsandobj {

	int eid;
	String name;
	int depno;
	String desi;
	double sala;


	void dispaly() {

		System.out.println(eid);
		System.out.println(name);
		System.out.println(depno);
		System.out.println(desi);
		System.out.println(sala);

	}


	@SuppressWarnings("unused")
	public static void main(String[]args){

		clsandobj emp1=new clsandobj();

		emp1.eid=10;
		emp1.name="ramesh";
		emp1.depno=12;
		emp1.desi="executive";
		emp1.sala=20000;
		emp1.dispaly();





		clsandobj emp2=new clsandobj();

		emp2.eid=11;
		emp2.name="mahesh";
		emp2.depno=12;
		emp2.desi="junior executive";
		emp2.sala=30000;
		emp2.dispaly();
	}
}












