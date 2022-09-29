//Hands-on Exercise 2
public class PrintNoDibisibleBy3and5 {
	public static void main(String args[]) {
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
}
