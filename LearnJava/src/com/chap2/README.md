## Recap of object oriented programming
As discussed earlier Java is an object oriented programming but we cannot say that Java is purely object oriented
because the latest version of Java supports functional programming too.

## What does object oriented mean?
The following are features of an object oriented concept:
1. Abstraction: Show only what is needed to be seen by the end user. The rest is in the underlying layer unexposed.
2. Encapsulation: Combine the attributes and behaviour of any entity into a single package.
3. Polymorphism: One entity performing different functions based on context.
4. Inheritance: Carrying over the legacy of past entities.

## Features of java
Object-Oriented (Class based), structured, imperative etc.

#####                   -- End of Recap --

## How does java program work?
As mentioned earlier a computer system does not understand non-machine languages. But if you have a look at the
HelloWorld program that we wrote yesterday it was all written in English.

You might have noted that the file extension for the HelloWorld program we wrote was ".java".
This java file needs to be compiled. 
-----------
**Compilation** is simply the process involving the following steps:

a) _Checking if there are any error in the syntax of the programming language._

b) _Converting the java code to byte code._

c) _Packaging the byte code into a file with the name of the class mentioned in the Java file, with a ".class" extension._

eg. Dog.java becomes Dog.class
Assume a situation when we have more than one classes defined in the same java file (say Combined.java has 2 classes
named One and Two). In this case you would have 1 java filed i.e. Combined.java while there would be 2 class files on
compilation One.class and Two.class.
------------

Hence the java program works in 2 steps:
1. Compiling the java program i.e. converting .java to .class 
[This was earlier done by using the command "_javac Dog.java_". In Eclipse IDE saving the java file automatically compiles it.]
2. Running the java program [This was earlier done using "_java Dog_". In Eclipse IDE we right click the java file and 
run as Java Application.]

## What is the Biggest advantage of Java
Java is platform independent. The earlier programming languages such as C were all platform dependent. Eg. If I develop
a code in a windows machine, and create a runnable file, this cannot be run on a linux machine.
In Java we can do so because of the above mentioned class file. Class file is platform independent and is exactly the
same for every Operating System. You create a program in one system, export the class files into a JAR (Java archive file)
and run this jar in another system and it works!!!
The java jdk is platform dependent (different for each OS).

## How does Java incorporate the features of object oriented programming.
1. Abstraction - The class concept is an example of abstraction. Assume the example of Dog Class, we have all the
attributes and behaviours (technically the variables and functions/methods) of this class well defined. When I give
the object of this class to someone else to use, the person can find each of the attributes and behaviour by just
calling it but he/she will never know why the bark function gives bow-bow and not meow because that is specific to the
developer of the class who hides it from the user.

2. Encapsulation - The variables and functions using these variables are all confined to the same template called
as Class which in itself is an example of encapsulation. In earlier programming models we did not have this freedom.

3. Polymorphism - In the further classes we would learn about terms "Method Overloading" and "Method overriding" which
in simple terms is nothing but number of methods with the same name performing similar/dissimilar processes (which is 
again the freedom of the developer to decide) based on the context that it is called upon.

4. Inheritance - In Java classes can inherit from other classes and still have common and specific features. Just like
a Dog Class which might have a number of features of its parent class (say Animal) but still some features specific to
itself which helps us differentiate between a Dog, Cat or Cow.

## Datatypes in Java
####Primitive Data Types 
1. byte
2. short
3. **int**
4. long
5. float
6. **double**
7. **boolean**
8. char

int, double and boolean are the most commonly used datatypes.