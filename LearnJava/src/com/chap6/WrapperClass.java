package com.chap6;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		WrapperClass obj= new WrapperClass();
		
		Character ch ='a';  //autoboxing
		
		char a =ch; //unboxing to assign value to a of datatype char
		
		System.out.println(a);
		
		int x=10;
		Integer y = new Integer(x);  //autoboxing
		System.out.println(y.intValue());
		
		y=y+5;  //unboxing
		System.out.println(y.intValue());
		
		int num =y;   //num =15
		int z = obj.getValue(num);
		System.out.println(z);
		
		
		// unboxing using assignment
		List<Double> ld = new ArrayList<Double>();
		ld.add(56.0);
		ld.add(89.35);
		
		double dl = ld.get(0);
		System.out.println(dl);
	}

	private Integer getValue(Integer num) {
		num = num +10;
		return num;
	}

}
