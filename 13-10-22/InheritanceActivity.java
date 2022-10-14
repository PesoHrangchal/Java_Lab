package lab;

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager m=new Manager(123,"Rohan","Shillong India",234632435,45600);
		m.calculateSalary();
		m.calculateTransportAllowance();
		Trainee t=new Trainee(173,"Michael","Churachandpur India",234632456,25600);
		t.calculateSalary();
		t.calculateTransportAllowance();
	}
}
