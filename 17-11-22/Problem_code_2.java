package lab;

import java.util.Scanner;

public class Problem_code_2 {
	public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x<=0||y<=0)
			throw new Exception("x and y should not be zero");
		else
			System.out.println("product of x and y is "+(x*y));
	}
}
