package lab;

import java.util.HashSet;
import java.util.Scanner;

public class Country {
		static HashSet<String>Country=new HashSet<>();
		 void storeCountryNames(String CountryName){
			Country.add(CountryName);
		}
		static String retrieveCountryName(String CountryName) {
			if (Country.contains(CountryName))
			return CountryName;
			else
			return null;
		}
		public static void main(String args[]) {
			Country obj=new Country();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of countries you want to insert:");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.println("Enter the name of Country "+i+":");
				obj.storeCountryNames(sc.next());
			}
			//System.out.println("Elements in HashSet(H1):"+Country);
			System.out.println("Enter country name to search in HashSet(H1):");
			System.out.println(retrieveCountryName(sc.next()));
			sc.close();
			
	}}

