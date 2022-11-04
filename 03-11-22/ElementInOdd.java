package lab;
/*
 * Q.3   we need to print the elements of the array which are present in odd positions. 
 * This can be accomplished by looping through the array and printing the elements of an 
 * array by incrementing i by 2 till the end of the array is reached
 */
import java.util.Scanner;

public class ElementInOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element:");
		int n=sc.nextInt();
		char arr[]=new char[n];
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		System.out.print("Elements in the odd position are:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
			j+=1;
		}
	}
}
