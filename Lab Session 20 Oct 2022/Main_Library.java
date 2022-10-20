package lab;
/*Lab Session 20 Oct 2022
 * Problem 3. 
Program to create library book Management system
to store and display book details in library where you can 
create two classes one is main another one is library, where you can 
create two methods as addBook,dispanseBook and 
bookId,bookName,bookAuthor as instance variables
 * */
import java.util.Scanner;

public class Main_Library {
	public static void main(String args[]) {
		Library L1=new Library();
		L1.addBook();
		L1.dispanseBook();
		}
}
class Library{
	int bookId;
	String bookName,bookAuthor;
	void addBook() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Id:");
		bookId=sc.nextInt();
		System.out.println("Enter Book Name:");
		bookName=sc.next();
		System.out.println("Enter Book Author:");
		bookAuthor=sc.next();
	}
	void dispanseBook() {
		System.out.println("Book ID="+bookId);
		System.out.println("Book Name="+bookName);
		System.out.println("Book Author="+bookAuthor);
	}
	
}
