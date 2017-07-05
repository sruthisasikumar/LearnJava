# LearnJava
## What is a programming language?
A programming language is a medium to create the instructions which helps to find a logical solution to any problem statement.

### Examples of programming language: 
Basic, C, C++, Java, Haskell, Scala etc.

## How does the computer system understand a programming language?
The computer system only understand binary language which is composed of 0 and 1.
For an end user writing such a program is cumbersome. Hence, users write the program in templates which are converted to machine understandable language by the compilers and interpreters. These templates are called as "code".

## How is code written?
The code can be written in any programming language like the ones already mentioned. This code must adhere to certain semantics and syntax which is specific to the programming language. As already mentioned the code is a template, so there is a defined structure to the template which must be followed. This is the Syntax of the code.

## What is java?
Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented and specifically designed to have as few implementation dependencies as possible. This language can be used to solve simple and complex analytical and logical problems. The extended purpose of this language ranges from solving a simple mathematical problem to developing presentable solutions like web applications. It is an open-sourced language.

### History of Java:
Designed by	James Gosling
Developer	Sun Microsystems (now owned by Oracle Corporation) in 1995
License	GNU General Public License, Java Community Process

## Why is java extensively used as compared to other programming languages?
Java is simple, flexible and particularly has both front end and back end development capabilities.
Java has its core designed in C. Hence it has all the advantages of the C programming.
Java is object oriented, hence it allows an easier visualization of packages to play around with.

## Features of java
Object-Oriented (Class based), structured, imperative etc.

## What does object oriented mean?
The following are features of an object oriented concept:
1. Abstraction: Show only what is needed to be seen by the end user. The rest is in the underlying layer unexposed.
2. Encapsulation: Combine the attributes and behaviour of any entity into a single package.
3. Polymorphism: One entity performing different functions based on context.
4. Inheritance: Carrying over the legacy of past entities.

## What are the components of Java?
Basic components: 
1. Class: This is the template in which we define the attributes and behaviours of any entity. Once the class is defined the Class itself behaves as the entity. eg: if the class is Dog, the attributes of a dog such as eyes, ears, legs etc are known to the Class called Dog. Along with these the behaviours such as the dog barking, sleeping etc. are known to the Class called Dog.
2. Attributes/Variables : The attributes mentioned above are called as variables in Java. These are the place holders for values specific to each class. eg: if color is an attribute of Dog class the value can be black, brown etc.
3. Behaviours/Methods : The behaviours mentioned above are called Methods/Functions in Java. These are the place holders for the processes available for each class. eg: if barks is a method in Dog class, it will showcase that the barking is with the sound bow-bow and not meow as it would have been in the case of a Cat Class.
4. Object : The instance of the class mentioned above is called an Object. Eg. Your dog might be named Tommy which is an object of Dog Class, while I have a dog named Alex which is another object of Dog class. Both the objects have the same attributes and behaviours but the values for attributes and the process mentioned in the behaviour might be different. Eg. color for Tommy is Black which color for Alex is White. Tommy wags his tail while barking while Alex doesn't do so.

Advanced components:
5. Package : It is a physical separation of code to confine similar set of classes into single entity. The package name goes along with the Class name whenever we execute a program.

## HelloWorld.java
> package com.chap1;
>
> public class HelloWorld {
>
>	public static void main(String[] args) {
>
>		System.out.println("Hello World!!!");
>	
> }
>
> }

Coding conventions:
1. Always have a package name in a java file.
2. The class having the main function/method should ideally be public.
3. The class name should be Starting with upper case followed by camel case. Eg. if class name is "Jurrasic" if class name is "JurrasicWorld". Here HelloWorld.
4. The function/method name should be in camel case i.e. starts with lowercase and every appended word starts with Uppercase. Eg. if function name is "main", if function name is "mainFunction"
5. The variable/attribute name should be in camel case i.e. starts with lowercase and every appended word starts with Uppercase. Eg. if function name is "test", if function name is "testVariable"
6. The code must be indented properly. In eclipse this can be done by using the shortcut. Ctrl + I after selecting all the contents of the java file. The indentation is automatic.

Description of the program:
- package: keyword to indicate that the name following is the location of the class being written below. You can treat them as folders/directories. i.e. com is a directory within the java project. within com is chap1 within which we have the class HelloWorld.
- public: public is an access specifier/access modifier, which indicates the level of accessibility of the entity to which it is associated. Here it is for both the class HelloWorld and the method/function named main.
The other access specifiers are private, protected and default.
- class: keyword to indicate the entity following is the name of the class we intent to create. Here HelloWorld.
- static: This keyword is used to indicate the entity following can be accessed from external context without creating an object of the class by directly using the class name. here, we can access the main function using HelloWorld.main(args) without creating an object of HelloWorld.
- void: void is a returntype of the following method/function. This means that the function main does not return any values.
- String[] args, String args[], String... args: Number of string arguments to be passed to the main function. Assume that you want a set of dynamic values to passed to the main function which you would decide at the run time, we can make use of this notation.
Points to remember:
We can only pass string arguments to main function. The numbers passed would be identified as strings unless we explicitly convert them to numbers in code.
The number of arguments once specified in the code cannot be changed during runtime. Only the values can be changed.

- System: Sytem is class which contains the basic functionalities default to the System. For eg. getting the current time.System.currentTimeMillis() will give the current time in a particular format(Long format).
- out: It is a function with System class that returns a stream object. In simple language it provides the medium to which we can write our message ("Hello World"). The stream is like a pipe through which if i pour water at one end it reaches the other end. Here the other end is the systems default output i.e. STD OUT or the console.
- println: This method mentions what needs to be sent through the stream. Once it prints the message it moves the offset of the next message to the next line. (adding a new line)
- print: On the other hand print function only prints the message without moving to next line.



