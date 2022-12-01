package lab;
//Q4
//01/12/22
import java.io.FileInputStream;

public class TextFileToArray {
	public static void main(String args[]) {
		
		try {
			FileInputStream f=new FileInputStream("D:\\Test1.txt");//Destination
			byte arr[]=f.readAllBytes();
			for(int i=0;i<arr.length;i++) {
				System.out.print((char)arr[i]);
			}
			f.close();
			}catch(Exception e) {}
			finally {
				System.out.println();
				System.out.println("Done");
				}

	}
}
