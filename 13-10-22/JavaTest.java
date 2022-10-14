package lab;
/*Q.3... Develop a public java class and make sure nobody 
 * can create any object of this class from outside the class
 */
public class JavaTest {
	public static void main(String args[]) {
		Java obj=new Java();//Object of Java class cannot be created
		obj.print();
	}
}
public class Java{
	void print(){
		System.out.println("Hi");
	}
}