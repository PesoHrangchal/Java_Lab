package lab;
//08/12/22
//Problem Statement 2:

//Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionOfArrayList {
	public static void main(String args[]) {
		List<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		System.out.println("Original List: "+al);
		List<String> extractList=al.subList(0, 3);
		System.out.println("Extracted List: "+extractList);
	}

}
