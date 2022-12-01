package lab;
//Q5
//01/12/22
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadLines {
	public static void main(String args[]) {
		try {
			FileInputStream f=new FileInputStream("D://test1.txt");
			BufferedInputStream b=new BufferedInputStream(f);
			LineNumberReader reader = new LineNumberReader(new InputStreamReader (b));
			String i;
			while(((i=reader.readLine())!=null)&&reader.getLineNumber()<=3) {
				System.out.println(i);
			}
			f.close();
			b.close();
			}catch(Exception e) {
				System.out.println(e);
			}
	}
}
