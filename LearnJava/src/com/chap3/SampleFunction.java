package com.chap3;

public class SampleFunction {
    public static void main(String args[]) {
        SampleFunction sampleObj = new SampleFunction();
        int a = 10;
        int b = 25;
        int sum = sampleObj.addNumbers(a, b);
        System.out.println("value of sum = "+sum);
    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
