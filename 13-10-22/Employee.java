package lab;
public class Employee {
	long employeeId;
	String employeeName;
	String employee_Address;
	long employee_Phone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	public Employee(long Id,String Name, String address,long phone){
		this.employeeId=Id;
		this.employeeName=Name;
		this.employee_Address=address;
		this.employee_Phone=phone;
	}
	void calculateSalary() {
		double salary;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("Salary="+salary);
	}
	void calculateTransportAllowance() {
		double transportAllowance=10*basicSalary/100;
		System.out.println("transportAllowance"+transportAllowance);
	}
	}
class Manager extends Employee{
	public Manager(int id,String name,String Address,long phone,double salary){
		super(id,name,Address,phone);
		super.basicSalary=salary;
	}
	void calculateTransportAllowance() {
		double transportAllowance=15*basicSalary/100;
		System.out.println("Transport Allowance="+transportAllowance);
	}
}
class Trainee extends Employee{
	public Trainee(int id,String address,String name,long phone,double salary) {
		super(id,name,address,phone);
		super.basicSalary=salary;
	}
}
