package com.Spring.Entity;

	import java.util.Iterator;
	import java.util.List;

	public class Bank { // class
		private int id;
		private String sname;
		private double bal;
		private List<String> acctype;

		public Bank(int id, String sname, double bal, List<String> acctype) { // parameterized constructor
			super();
			this.id = id;
			this.sname = sname;
			this.bal = bal;
			this.acctype = acctype;
		}

		public void display() { // method
			System.out.println(id + " " + sname + " " + bal);
			System.out.println("Account Types Are: ");
			Iterator<String> itr = acctype.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}
