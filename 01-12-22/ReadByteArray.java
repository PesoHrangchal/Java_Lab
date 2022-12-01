package lab;
//Q3
//01/12/22
import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteArray {
	public static void main(String[] args)throws IOException {
		try {
			FileInputStream f=new FileInputStream("D:\\Test1.txt");
			byte fout[]=new byte[1024];
			int i=0;
			while((i=f.read(fout))>0) {
				System.out.print(new String(fout,0,i));
			}
		}catch(Exception e){
			
		}
	}
}
