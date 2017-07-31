package com.chap7;

import java.util.Scanner;

public class Decision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 9 : ");
		String val = sc.next();
		
		// converting string to integer
		int intVal = Integer.parseInt(val);
		
		// if value of intVal is greater than 5 reset to 0.
//		if(intVal > 100) {
//			intVal = 0;
//		}
		
//		System.out.println("value is "+intVal);
		sc.close();
		
		Decision dec = new Decision();
		System.out.println("value :"+dec.getNumberType(intVal));
	}

	private String getNumberType(int intVal) {
		String num = null;
		if(intVal == 1) {
			num = "one";
		} else if (intVal > 0 && intVal < 5) {
			num = "small";
		} else if (intVal >= 0 && intVal <= 9) {
			num = "big";
		} else if (intVal == 0 || intVal > 9) {
			num = "out of range";
		} else {
			num = "invalid number";
		}
		
		return num;
	}

}
