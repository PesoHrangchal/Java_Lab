package lab;

import java.util.ArrayList;

public class ListLoader {
	ArrayList<Integer> L= new ArrayList<Integer>();
	void loadList(Integer startNumber,Integer lastNumber ) {
		for(Integer i=startNumber;i<=lastNumber;i++) {
			L.add(i);
		}
	}
	public static void main(String args[]) {
		long start_time=System.currentTimeMillis();
		ListLoader L1=new ListLoader();
		L1.loadList(0,10000000);
		long end_time=System.currentTimeMillis();
		long response_time=end_time-start_time;
		System.out.println("Response Time="+response_time+" milliseconds");
	}
}
