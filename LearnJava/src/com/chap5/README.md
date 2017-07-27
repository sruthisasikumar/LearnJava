## Recap:
Methods are a set of codes that executes some operations. Methods can be 
parameterized or non-parameterized methods depending on whether arguments 
are passed. A method declaration should always have a returntype. If the 
method does not return anything it is called a void method.

In java, the methods are of type call-by value. This is because even when an 
object is passed as an argument, only a copy of its value is passed.

##### --------------------- End of Recap -----------------------
#### Input from a User:

In java, we can write codes where a user can provide the input during the 
execution. Java provides built-in methods for the same. This can be done via:

1. Scanner class:  
2. BufferedReader and InputStreamReader classes:
  (This will be handled later once we complete exception handling.)


#### String:

String class is provided by java. String literals contain alphanumerics
(alphabets, numbers, symbols)within double quotes. Strings are objects in java.

Ex:
```ruby 
String name = "Veena";
String nums = "12456";
```

Here, the variable 'nums' declared as a string can never be used as an integer 
value,ie, no mathematical operations can be done on it.


#### Operations of String:

See StringExample.java

#### java.lang package
It is interesting to note that we can only use a class by importing the same in our code.
You might have noted that we had to import Scanner class using the following statement:

```ruby
import java.util.Scanner;
```
import is the command used to explicitly call external classes to be used in our java program.
Each class/java file using the external class needs to import the class within the project.

But we can still use classes like System, String etc. without importing the class.
This is because these classes are part of java.lang package which is implicitly imported on compile.