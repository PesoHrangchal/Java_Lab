package lab;

import java.util.Scanner;

/*Q. 2 
Write a Java program to find sequences of lowercase letters joined with a underscore.
*/

public class LowercaseUnderscore {
	public static void main(String... s) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		if(isLowercase(str)==true&&checkUnderscore(str)==true)
				System.out.println("Found a match");
			else
				System.out.println("Not match");
	}
	static boolean isLowercase(String s) {
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]!='_') {
				if(!Character.isLowerCase(a[i])){
					return false;
				}
			}
		}
		return true;
	}
	static boolean checkUnderscore(String s1) {
		char[] b=s1.toCharArray();
		for(int i=1;i<b.length-1;i++) {
			if(b[i]=='_') {
			return true;}
		}
		return false;
	}
}
