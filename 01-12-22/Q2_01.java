package lab;
//Q2
//01/12/22
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q2_01 {
public static void main(String args[])throws IOException {
	while(true) {
	System.out.println("Choose an Option:");
	System.out.println();
	System.out.println("Press 1 to write to file:");
	System.out.println("Press 2 to read from file:");
	Scanner sc=new Scanner(System.in);
	
	int choice=sc.nextInt();
	switch(choice) {
		case 1:try {
			FileOutputStream f=new FileOutputStream("D:\\Test1.txt");//Destination
			System.out.println("Enter any text:");
			String s=sc.next();
			byte b[]=s.getBytes();//converting string into byte array
			f.write(b);
			f.close();
			}catch(Exception e) {}
			break;
		case 2:try{
			FileInputStream f1=new FileInputStream("D:\\Test1.txt");//Destination
			byte arr[]=f1.readAllBytes();
			for(int i=0;i<arr.length;i++) {
				System.out.print((char)arr[i]);
			}
			f1.close();
			}catch(Exception e) {}
			break;
		default:
			System.out.println("Enter a valid input!");
}}}}
