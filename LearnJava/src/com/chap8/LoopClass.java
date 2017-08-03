package com.chap8;

import java.util.Scanner;

public class LoopClass {
/*
 * to find the factorial of a number
 */
	public static void main(String[] args) {
	LoopClass objLoop = new LoopClass();
	int fact =0;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = scan.nextInt();
	
	//fact=objLoop.getFactFor(num);
	//fact = objLoop.getFactWhile(num);
	fact = objLoop.getFactDoWhile(num);
	
	System.out.println("The factorial is "+fact);
	
	scan.close();
	
	/*
	 * traversing using extended for loop
	 */
	int[] list = {10,20,30,40,50,60};
	
	System.out.println("To print the values in the list:");
	for(int value: list){
		System.out.println(value);		
	}
	}

	/*
	 * to find factorial using do-while loop
	 */
	private int getFactDoWhile(int num) {
		System.out.println("Inside getFactDoWhile");
		int fact =1, i =num;
		do{
			fact = fact*i;
			i--;
		}while(i>0);
		return fact;
	}

	/*
	 * to find factorial using 'while' loop
	 */
	private int getFactWhile(int num) {
		System.out.println("Inside getFactWhile");
		int fact=1, i=num;
		while(i>0){
		fact = fact*i;
		i--;
		}
	return fact;
}

	/*
	 * to find factorial using 'for' loop
	 */
	private int getFactFor(int num) {
		System.out.println("Inside getFactFor");
		int fact =1;
		for(int i =num;i>0;i--){
			fact = fact*i;
		}
		return fact;
	}

}