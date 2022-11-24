package lab;
class RunnableThreadTest1 extends Thread{
	public void run() {
		for(int i=1;i<=4;i++)
			System.out.print("ABC");
			System.out.print("ACA");
		for(int i=1;i<=4;i++)
			System.out.print("BCA");
			System.out.print("BCB");
	}
}
public class Problem3_24_11 {
	public static void main(String args[]) {
		RunnableThreadTest1 r=new RunnableThreadTest1();
		r.start();
	}
}
