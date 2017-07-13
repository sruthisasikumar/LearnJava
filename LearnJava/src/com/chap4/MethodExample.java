package com.chap4;

public class MethodExample {
	
	public static void main(String[] args) {
		
		String name = "Sruthi";
		int yearOfBirth= 1991;
		
		MethodExample obj = new MethodExample();
		String age =obj.getDetails(name,yearOfBirth);
		System.out.println("Name:" +name +"\t"+age);
		
	}

	private String getDetails(String name, int yearOfBirth) {
		
		MethodExample obj1 = new MethodExample();
		int age = obj1.getAge(yearOfBirth);
		String returnStatment = "Year Of Birth:" +yearOfBirth  +"\t Age:" +age;
		return returnStatment;
	}

	private int getAge(int yearOfBirth) {
		
		int currrentYear=2017;
		int age = currrentYear - yearOfBirth;
		return age;
	}

	

	

}
