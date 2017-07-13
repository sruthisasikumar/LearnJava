package com.chap4;

public class PassByExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = 0;
		PassByExample pbe = new PassByExample();
		sum = pbe.addByValue(a,b);
		System.out.println(sum);
		
		ReferenceClass refC = new ReferenceClass();
		refC.setA(a);
		refC.setB(b);
		sum = pbe.addByReference(refC);
		System.out.println(sum);
	}

	// Pass by value example
	private int addByValue(int a, int b) {
		int sum = a + b;
		return sum;
	}

	// Pass by reference example
	private int addByReference(ReferenceClass refClassObj) {
		int sum = refClassObj.getA() + refClassObj.getB();
		return sum;
	}
}

class ReferenceClass {
	int a;
	int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}