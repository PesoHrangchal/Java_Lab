package lab;
/*
 * Q.2... Write a java class to develop an employee class object & 
 * initialized the emp name & emp Id for 5 Emp. now write another class having name 
 * and from this class you have to create 5 employee objects but you are not allowed to use new keyword.
 * */
public class Employee1 {
	static String emp_name;
	static int emp_Id;
	static void create(int id,String name) {
		emp_name=name;
		emp_Id=id;
	}
	}
class Employee2{
	public static void main(String [] args) {
		Employee1.create(123,"Hrangchal");
		Employee1.create(124,"Atif");
		Employee1.create(125,"Reuben");
		Employee1.create(126,"Michael");
		Employee1.create(127,"Peso");
	}
}