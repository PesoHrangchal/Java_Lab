package lab;

import java.util.Scanner;

public class Problem_code_3 {
	public static void addTwoPositive(int a,int b) throws ArithmeticException{
		try {
			if(a<0||b<0)
				throw new ArithmeticException("non positive integer");
			else
				System.out.println("The sum of two number is "+(a+b));
		}catch(ArithmeticException e){
			System.out.println(e);
		}
			finally {
			System.out.println("End of the program");
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter two positive number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		addTwoPositive(a,b);
	}
}
