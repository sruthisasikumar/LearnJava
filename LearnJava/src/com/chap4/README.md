## Recap of DataTypes and TypeCasting:

We have seen the primitive datatypes in Java language: byte,char,short,int,long,float,double,boolean, as well as , the referential datatype String. String is a class available in the Java library. On creating a datatype, each time we are creating an object of the String class, hence called a referential datatype.

Type casting is converting the value of one datatype to another. 
It can be of two types:

1. Implicit Typecasting: the compiler understands the type casting implicitly.
2. Explicit Typecasting: explicitly converting to target datatype before assigning the value.

##### ---------------- End Of Recap ----------------
#### Methods in Java:

Method is a set of code that executes some operation, and can be called using the method name.
In a Java program, the compilation always starts from the "main" method (public stativ void main ).
Methods can be:

1. Parameterized Methods: where parameters are passed as arguments to methods.
2. Non-parameterized Methods: where no arguments are passed to methods.

Method Invocation:
In Java a method can be invoked using the method name, along with any arguments to be passed to the method.
Ex: 
        
```ruby
        Class Sample{
                public static void main(String args[]){
                 Sample sampleObj = new Sample();
                 String test = sampleObj.sampleMethod();
                 System.out.println(test);
                 }
               public String sampleMethod(){
                Sytem.out.println("Inside sampleMethod");
                return "Exiting sampleMethod";
                }
            }
```
       
Here, the method "sampleMethod", is invoked by using the dot operator before the method name.

A method may or may not have a return type.
Ex: 
```ruby
public String sampleMethod(){
                Sytem.out.println("Inside sampleMethod");
                return "Exiting sampleMethod";
}
```

Here, String is the returntype of sampleMethod. If return statement is missing in this method, it raises an error.

Ex: 
```ruby
public void sampleMethod(){
                Sytem.out.println("Inside sampleMethod");
                Sytem.out.println("Exiting sampleMethod");
}
```

Here, the method does not return anything, hence the return type is "void".

###### Built-In and User-Defined methods:
Methods can be built-in methods which are part of the compiler package.Ex: In the above example 'Sytem.out.println()', is an example of a built-in method.Another example is 'System.exit(0)'. User-defined methods are the methods created by the user to carry out some operations. Ex: 'sampleMethod()' created in the above example.

###### Call-by-Value and Call-by-Reference:
Calling a method by passing a value is called call-by-value. 
Here, value of x and y are passed to changeData method of class Data. Even though the values are changed in the method, since only the copies of the original values are passed to the method, the values of x and y are not affected.
In call-by-reference method, an object is passed as an argument to a method. Here a copy of the reference to the value of the object is being passed, as such the values in the main method is affected.
Ex: 

```
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
```




