package lab;
//Q.1   Write a Java program to test if an array contains a specific value.
import java.util.Scanner;

public class SpecificValue {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" values:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search:");//user input value to search
		int search=sc.nextInt();
		boolean flag = false;
		for(int a=0;a<5;a++) {
			if(arr[a]==search) {
				flag=true;//check presence of value
				break;
			}else {
				continue;
			}
		}
			System.out.println(flag==true);//print true or false
		}
}
