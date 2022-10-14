package lab;
/*
 * Q.2... Write a java class to develop an employee class object & 
 * initialized the emp name & emp Id for 5 Emp. now write another class having name 
 * and from this class you have to create 5 employee objects but you are not allowed to use new keyword.
 * */
class Employee2 {
	static String emp_name;
	static int emp_Id;
	static void create(int id,String name){
		emp_Id=id;
		emp_name=name;
		System.out.println(emp_Id+" "+emp_name);
	}
	}
class Employee1{
	public static void main(String [] args) {
		Employee2.create(123,"Hrangchal");
		Employee2.create(124,"Atif");
		Employee2.create(125,"Reuben");
		Employee2.create(126,"Michael");
		Employee2.create(127,"Peso");
	}
}
