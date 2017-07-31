package com.chap7;

public class PrePost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 5; 

		System.out.println("i = "+i); // prints 5
		// In post increment the value is printed first and then the increment happens.
		// post increment
		System.out.println("i++ = "+i++); // prints 5
		System.out.println("i = "+i); // prints 6
		
		// post decrement
		System.out.println("i-- = "+i--); // prints 6
		System.out.println("i = "+i); // prints 5
		
		// In pre increment the increment happens first and then the value is printed.
		// pre increment
		System.out.println("++i = "+ ++i); // prints 6
		System.out.println("i = "+ i); // prints 6
		
		// pre decrement
		System.out.println("--i = "+ --i); // prints 5
		System.out.println("i = "+ i); // prints 5

	}

}
