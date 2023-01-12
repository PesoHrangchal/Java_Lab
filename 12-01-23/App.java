package com.BMS_Hibernate;

import java.util.Scanner;

import BMS_Hibernate.daoImpl.BMS_DaoImpl;

public class App{
	public static void main(String args[]) {
		BMS_DaoImpl dao=new BMS_DaoImpl();
    	char c;
    	do {
    		Scanner sc =new Scanner(System.in);
    		System.out.println("Press 1 to create new account \nPress 2 to deposit \nPress 3 to withdraw \n"
    				+ "Press 4 to show account \nPress 5 to update account \nPress 6 to delete account "
    				+ "\npress 7 to Exit");
    		int a =sc.nextInt();
    		switch(a) {
    		case 1:dao.createAccount();
    		break;
    		case 2:dao.depositMoney();
    		break;
    		case 3:dao.withdrawMoney();
    		break;
    		case 4:dao.showAccount();
    		break;
    		case 5:dao.updateAccount();
    		break;
    		case 6:dao.deleteAccount();
    		break;
    		case 7:System.exit(0);
    		default: System.out.println("Invalid Choice!");
    		}
    		System.out.println("Do you want to continue? Y/N");
    		c=sc.next().charAt(0);
    		
    	}
    	while(c=='y' || c=='Y');
    	
    	System.out.println("Thank You");
    }
}
