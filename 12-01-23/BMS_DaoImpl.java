package BMS_Hibernate.daoImpl;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.BMS_Hibernate.Account;
import com.HibernateCrud.config.HibernateUtil;

public class BMS_DaoImpl {
	Scanner sc=new Scanner(System.in);
	public void createAccount() {
		System.out.println("enter A/C no.:");
		int accountNo=sc.nextInt();
		System.out.println("enter name:");
		String name=sc.next();
		System.out.println("enter phone:");
		int phone=sc.nextInt();
		System.out.println("enter balance:");
		int balance =sc.nextInt();
		System.out.println("enter pin:");
		int pin =sc.nextInt();
		Account ac =new Account();
		ac.setAccount_No(accountNo);
		ac.setName(name);
		ac.setPhone(phone);
		ac.setBalance(balance);
		ac.setPin(pin);
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(ac);
		t.commit();
	}
	
	public void depositMoney() {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Account Number: ");
			int ac_no=sc.nextInt();
			Session session =HibernateUtil.getSessionFactory().openSession();
			Transaction t =session.beginTransaction();
			Account acc =session.get(Account.class,ac_no);
			System.out.println("Enter Amount to Deposit: ");
			int add_Money=sc.nextInt();
			System.out.println("Enter PIN:");
			int pin=sc.nextInt();
			if(pin!=acc.getPin()) {
				System.out.println("Incorrect PIN!");
			}else {
			acc.setBalance(acc.getBalance()+add_Money);
			session.update(acc);
			System.out.println("Amount deposited Successfully...");
			t.commit();
			}
	}
	
	public void withdrawMoney() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int ac_no=sc.nextInt();
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		Account acc =session.get(Account.class,ac_no);
		System.out.println("Enter Amount to Withdraw: ");
		int withdraw_Money=sc.nextInt();
		System.out.println("Enter PIN:");
		int pin=sc.nextInt();
		if(pin!=acc.getPin()) {
			System.out.println("Incorrect PIN!");
		}else {
		acc.setBalance(acc.getBalance()-withdraw_Money);
		session.update(acc);
		System.out.println("Amount withdrawed Successfully...");
		t.commit();
		}
	}
	
	public void showAccount() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int ac_no=sc.nextInt();
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		Account acc =session.get(Account.class,ac_no);
		if(acc==null) 
			System.out.println("NO DATA PRESENT");

		
		else
			System.out.println("Account Number="+acc.getAccount_No()+"\nCustomer Name="+acc.getName()+"\nPhone Number="+acc.getPhone()+"\nAccount Balance="+acc.getBalance());
		System.out.println("\nAccount Details is displayed above");
		t.commit();
	}
	
	public void updateAccount() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int ac_no=sc.nextInt();
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		Account acc =session.get(Account.class,ac_no);
		System.out.println("Enter PIN:");
		int pin=sc.nextInt();
		if(pin!=acc.getPin()) {
			System.out.println("Incorrect PIN!");
		}else {
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		acc.setName(name);
		System.out.println("Enter new PIN: ");
		int new_pin=sc.nextInt();
		acc.setPin(new_pin);
		System.out.println("Update your phone number: ");
		int phone=sc.nextInt();
		acc.setPhone(phone);
		session.update(acc);
		System.out.println("Account Updated Successfully...");
		t.commit();
		}
	}
	
	public void deleteAccount() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int ac_no=sc.nextInt();
		Session session =HibernateUtil.getSessionFactory().openSession();
		Transaction t =session.beginTransaction();
		Account acc =session.get(Account.class,ac_no);
		System.out.println("Enter PIN:");
		int pin=sc.nextInt();
		if(pin!=acc.getPin()) {
			System.out.println("Incorrect PIN!");
		}else {
		session.delete(acc);
		System.out.println("Account Deleted Successfully");
		t.commit();
		}
	}
}
