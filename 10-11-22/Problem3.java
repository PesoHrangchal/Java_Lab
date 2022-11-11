package lab;

public class Problem3 {
	public static void main(String...args) {
		StringBuilder str=new StringBuilder("C://IBM//DB2//PROGRAM//DB2COPY1.EXE");
		System.out.println("Drive:"+str.substring(0,3));
		System.out.println("Folder:"+str.substring(3,6).concat("||")+str.substring(7,10).concat("||")+str.substring(11,18));
		System.out.println("File:"+str.substring(20));
	}
}
