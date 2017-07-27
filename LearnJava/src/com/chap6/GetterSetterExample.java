package com.chap6;

import java.util.Scanner;

public class GetterSetterExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		EmployeeClass empObj = new EmployeeClass();
		
		System.out.println("Please enter the details of the employee:");
		
		System.out.println("Name:");
		empObj.setEmpName(scan.next());
		
		System.out.println("Age:");
		empObj.setEmpAge(scan.nextInt());
		
		
		System.out.println("Emp ID:");
		empObj.setEmpId(scan.next());
		
		System.out.println("Address: ");
		empObj.setEmpAddress(scan.next());
		
		System.out.println("Designation:");
		empObj.setEmpDesignation(scan.next());
		
		
		System.out.println("Salary:");
		empObj.setEmpSalary(scan.nextLong());
		
		System.out.println("Printing employee details:");
		System.out.println("Name: "+empObj.getEmpName());
		System.out.println("Age: "+empObj.getEmpAge());
		System.out.println("Emp ID: "+empObj.getEmpId());
		System.out.println("Address: "+empObj.getEmpAddress());
		System.out.println("Designation: "+empObj.getEmpDesignation());
		System.out.println("Salary: "+empObj.getEmpSalary());
	}
}
