package lab;
//08/12/22
//Problem Statement 1:

//Write a Java program to update specific array element by given element

public class UpdateArrayElement {

		public static void main(String args[]) {
			String S1[]=new String[] {"Red","Blue","Green","Black"};
			System.out.println("Original array:");
			for(int i=0;i<S1.length;i++) {
				System.out.println(S1[i]);
			}
			S1[2]="Yellow";
			System.out.println();
			System.out.println("Updated array:");
			for(int i=0;i<S1.length;i++) {
				System.out.println(S1[i]);
			}
	}
}
