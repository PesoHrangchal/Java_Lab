package lab;
/*Lab Session 20 Oct 2022
 * Problem 1. 
Write a Java method to check whether every digit of a given integer 
is even. Return true if every digit is odd otherwise false?
*/
import java.util.Scanner;

public class Check_Even {

	static boolean check(int num) {//method to check even or not
		while(num>0) {
			int n=num%10;
			if(n%2!=0) {
				return(false);
			}else {
				num/=10;
			}
		}
		return(true);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();//User input
		System.out.print(check(num));//Print output after method call
	}
}
