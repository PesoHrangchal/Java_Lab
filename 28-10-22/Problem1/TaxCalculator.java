package lab;
class TaxCalculator {
	float basicSalary;
	boolean citizenship;
	float calculateTax() {
		float tax=30*basicSalary/100;
		System.out.println("The Tax of the employee for the "+basicSalary+" is "+tax);
		return tax;
	}
	void deductTax() {
		int nettSalary=(int) (basicSalary-calculateTax());
		System.out.println("The nett salary of the employee "+nettSalary);
	}
	void validateSalary() {
		if(basicSalary>100000&&citizenship==true) {
			System.out.print("The salary and citizenship eligibility: true");
		}else {
			System.out.print("The salary and citizenship eligibility: false");
		}
	}
}
