package com.menudriven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.menudriven.Helper;
class IDNotFoundException extends Exception{ //Created a custom Exception
	IDNotFoundException(String str){
		super(str);
	}
}
class InvalidSalaryException extends Exception{ //Created a custom Exception
	InvalidSalaryException(String str){
		super(str);
	}
}

public class EmployeeUploader {
	int dept_id,emp_salary,contact,emp_id;
	String emp_name,emp_add,dept_name,dept_head,dept_des;
	Scanner sc = new Scanner(System.in);
	//saving student details in database
	public void storeDepartmentDetails() throws SQLException  {
	//User Input 
	
	System.out.println("Enter the Department_ID: ");
	dept_id=sc.nextInt();
	System.out.println("Enter Department_Name: ");
	dept_name=sc.next();
	System.out.println("Enter department_Head: ");	
	dept_head=sc.next();
	System.out.println("Enter Department_Description: ");
	dept_des=sc.next();
	Connection conn=Helper.con();
	PreparedStatement stmt= conn.prepareStatement("Insert into Department values(?,?,?,?)");
	stmt.setInt(1,dept_id);
	stmt.setString(2,dept_name);
	stmt.setString(3,dept_head);
	stmt.setString(4, dept_des);
	stmt.executeUpdate();
	System.out.println("Inserted successfully");
}
//fetching department details in the database(display)

public void storeEmployeeDetails()  throws SQLException,InvalidSalaryException  {
	//User Input 
	System.out.println("Enter the Employee_Id: ");
	emp_id=sc.nextInt();
	System.out.println("Enter	Employee_Name: ");
	emp_name=sc.next();
	System.out.println("Enter 	Employee_Salary	");	
	emp_salary=sc.nextInt();
	System.out.println("Enter 	Employee_Contact_No: ");
	contact=sc.nextInt();
	System.out.println("Enter 	Employee_address: ");	
	emp_add=sc.next();
	System.out.println("Enter 	Department id "+" ");	
	dept_id=sc.nextInt();
	if(emp_salary<1000) {
		throw new InvalidSalaryException("salary can't be less than 1000");
	}
	else
	{
	Connection conn=Helper.con();
	PreparedStatement stmt=conn.prepareStatement("insert into employee values(?,?,?,?,?,?)");
	stmt.setInt(1,emp_id);
	stmt.setString(2,emp_name);
	stmt.setInt(3,emp_salary);
	stmt.setInt(4, contact);
	stmt.setString(5, emp_add);
	stmt.setInt(6, dept_id);
	stmt.executeUpdate();
	System.out.println("Inserted successfully");
}}

//fetching department details in the database(display)
public void displayempdetails(int id) throws SQLException,IDNotFoundException{
	Connection conn = Helper.con();
	Statement stmt = conn.createStatement();
	//execute query fetch data from database
	ResultSet rs= stmt.executeQuery("select employee_id,employee_name,employee_contact_no,employee_address,department_name,department_head from employee inner join department on employee.department_id=department.department_id where emp_id="+id);
	if(!rs.next()) {
		throw new IDNotFoundException("ID not present");
}else {
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6));
}}
public void pfcalculator(int id) throws SQLException,IDNotFoundException {
	int salary=0;
	Connection conn = Helper.con();
	Statement stmt = conn.createStatement();
	//execute query fetch data from database
	ResultSet rs= stmt.executeQuery("select employee_salary from employee where employee_id="+id);
	if(!rs.next()) {
		throw new IDNotFoundException("ID not present");
	}else if(salary>=1000 && salary<=10000) {
		System.out.println("PF amount: "+(salary*5)/100);}
	else if(salary>=10000 && salary<=100000) {
		System.out.println("PF amount: "+(salary*6)/100);}
	else if(salary>100000) {
		System.out.println("PF amount: "+(salary*7)/100);}
	}
	}

