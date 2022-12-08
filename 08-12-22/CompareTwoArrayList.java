package lab;
//08/12/22
//Problem Statement 3:
//Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {
	public static void main(String args[]) {
		List<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Black");
		al.add("White");
		al.add("Pink");
		System.out.println("List 1: "+al);
		List<String> al2=new ArrayList<String>();
		al2.add("Red");
		al2.add("Green");
		al2.add("Black");
		al2.add("Pink");
		System.out.println("List 2: "+al2);
		if(al.equals(al2)==true) {
			System.out.println("Array Lists are equal.");
		}
		else {
			System.out.println("Array Lists are not equal.");
	}
	}
}
