package lab;
import java.util.StringTokenizer;
//LAB Session 10th Nov 2022
public class Q1 {
	public static void main(String... args) {
		//Problem Statement 1:
		String str=new String("Welcome to Java World");
		System.out.println(str.charAt(4));//print character at 5th position
		System.out.println((str.compareTo("Welcome")>0)?"Yes":"No");//compare if str is greater than "Welcome"
		System.out.println(str+" -Let us learn");//concat str with "-Let us learn"
		for(int i=0;i<str.length();i++) {//for loop
			if(str.toCharArray()[i]=='a') { //check character at each index until first occurrence
				System.out.println("a first occur in the "+(i+1)+" position");
				break;
			}
			}
		System.out.println(str.replaceAll("a","e"));//replace a to e
		System.out.println(str.substring(4,10));//•	Returns string between 4th position and 10th position and display it.
		System.out.println(str.toLowerCase());//Return lower case of the string
		System.out.println();
		
		//Problem Statement 2:
		StringBuffer s1=new StringBuffer("This is StringBuffer");
		System.out.println("The added String is:"+s1.append("This is a simple program"));//append string to existing string
		s1.insert(21,"Object");//insert string object to existing string
		System.out.println("The inserted string at 21st position is:"+s1);
		s1.reverse();//reverse the string
		System.out.println("The reversed String is:"+s1);
		StringBuffer s2=new StringBuffer("This is StringBuffer");
		System.out.println(s2.replace(14, 22, "Builder"));//replace buffer to builder and display
		
		//Problem Statement 3:
		StringTokenizer st=new StringTokenizer("C://IBM//DB2//PROGRAM//DB2COPY1.EXE");
		while(st.hasMoreTokens()) {
			System.out.println();
			System.out.print(st.nextToken("/"));
		}
}
}
