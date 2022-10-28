package lab;

public class EmployeeTax {
	public static void main(String args[]) {
		TaxCalculator t=new TaxCalculator();
		t.basicSalary=125000;
		t.citizenship=true;
		//t.calculateTax();
		t.deductTax();
		t.validateSalary();
	}
}
