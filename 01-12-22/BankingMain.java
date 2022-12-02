package lab;

class Bank {
		int total = 100;
		
		synchronized void deposit(int amount) {
			System.out.println("Balance: "+total);
			total+=amount;
			System.out.println("deposit is completed");
			System.out.println("Total balance is: "+total);
			notify();
			try {
				Thread.sleep(100);}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	synchronized void withdraw(int amount2) {
		total-=amount2;
		System.out.println("Withdrawl amount is: "+amount2);
		System.out.println("Total balance is: "+total);
		notify();
	}}
class Thread1 extends Thread{
	Bank b;
	Thread1(Bank b){
		this.b=b;
	}public void run() {
		b.deposit(50000);
}}
class Thread2 extends Thread{
	Bank b;
	Thread2(Bank b){
		this.b=b;
	}
	public void run() {
		b.withdraw(50000);
	}}
public class BankingMain{
	public static void main(String[] args) {
		Bank obj = new Bank();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}
