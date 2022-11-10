package lab;
import java.util.*;

public class RemoveDuplicate {
	

	 public static void main(String[] args) {
	  String str1 = "Anudip Foundation Skill & career development";
	  System.out.println("The given string is: " + str1);
	  String str2 = "Famous";
	  System.out.println("\nString to check and remove the latters: " + str2);
	  char arr[] = new char[str1.length()];
	  char[] m = new char[300];
	  for (int i = 0; i < str2.length(); i++)
	   m[str2.charAt(i)]++;
	  System.out.println("\nThe new string is: ");
	  for (int i = 0; i < str1.length(); i++) {
	   if (m[str1.charAt(i)] == 0)
	    System.out.print(str1.charAt(i));
	  }
	 }
	}