package lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1 {
		static ArrayList<Integer> A1=new ArrayList<Integer>();
		ArrayList<Integer> storeEvenNumbers(int N) {
			A1=new ArrayList<Integer>();
			int a=2;
			while(a<=N) {
				A1.add(a);
				a+=2;
			}
			return A1;
		}
		
		void printEvenNumbers(){
			ArrayList<Integer>A2=new ArrayList<Integer>();
			for(int a:A1) {
				A2.add(a*2);
			}
			Iterator<Integer>itr=A2.iterator();
			System.out.println("Elements of ArrayList(A2)");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
		
		int retrieveEvenNumber(int N) {
			for(int i=0;i<A1.size();i++) {
				if(A1.get(i)==N)
					return N;
			}
			return 0;
		}
		
		public static void main(String args[]) {
			ArrayList1 p1=new ArrayList1();
			System.out.println("Enter the last even number for ArrayList(A1):");
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			if (N%2!=0) {
				System.err.println("Not even number!");
			}else {
			p1.storeEvenNumbers(N);
			p1.printEvenNumbers();
			System.out.println("Enter even number to search in arrayList(A1)");
			int n=sc.nextInt();
			sc.close();
			System.out.println(p1.retrieveEvenNumber(n));
			}
		}

}
