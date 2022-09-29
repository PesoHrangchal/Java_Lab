//Hands-on Exercise 2
public class PrintNoDibisibleBy3and5 {
	public static void main(String args[]) {
		System.out.println("Divisible by 3:");
		for(int i=1;i<=100;i++) {
			if(i%3==0)
				
				System.out.print(i+" ");
			}
		System.out.println();
		
		System.out.println("Divisible by 5:");
		for(int i=1;i<=100;i++) {
				if(i%5==0)
					System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Divisible by both 3 and 5:");
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%5==0)
				System.out.print(i+" ");
		}
	}
}
