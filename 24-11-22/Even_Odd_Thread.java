package lab;
//Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print
class first extends Thread{
	public void run() {

		for(int i=1;i<=100;i++)
			if(i%2==0)
			System.out.print(i+", ");
		System.out.println();
	}
}

public class Even_Odd_Thread extends Thread{
	public void run() {
		for(int i=1;i<=100;i++)
			if(i%2!=0)
			System.out.print(i+", ");
	}
	public static void main(String[] args) {
		first f=new first()	;
		Even_Odd_Thread l=new Even_Odd_Thread();
		System.out.println("Even nos from 1-20:");
		f.start();
		try {
			f.sleep(10);
			f.join();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Odd nos from 1-20: ");
		l.start();
	}
}