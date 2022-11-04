package lab;
/*Q.2   Write a Java program to find the duplicate values
of an array of integer values.
*/

import java.util.Scanner;

public class Duplicate_Value {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter five elements in an array:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int j=0;j<5;j++) {
			for(int l=j+1;l<5;l++) {
				if(arr[j]==arr[l]) {
					flag=true;
					System.out.println(arr[j]+" is a duplicate value");
				}
			}
		}
		if(flag==false) {
			System.out.println("No duplicate values in the array.");
		}
	}
}
