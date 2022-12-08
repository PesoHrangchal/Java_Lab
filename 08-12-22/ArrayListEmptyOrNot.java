package lab;
//08/12/22
//Problem Statement 4:

//Write a Java program to test an array list is empty or not.

import java.util.ArrayList;
import java.util.List;

public class ArrayListEmptyOrNot {
	public static void main(String args[]) {
		List<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Black");
		al.add("White");
		al.add("Pink");
		if(!al.isEmpty()) {
		System.out.println("List is not empty.");
		System.out.println(al);
		al.clear();
		}
		if(al.isEmpty())
			System.out.println("List is empty now!");
		System.out.println(al);
	}
}
