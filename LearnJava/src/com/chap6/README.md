##Recap:
In Java, user inputs can be taken using Scanner class and BufferedReader
and InputStreamReader classes.
We have seen the various String operations in Java and the import keyword.

#####---------------------- End of Recap ------------------------

#### Getter and Setter Methods:

Getter and setter methods are used to access private variables of a class 
from another class. Variables of a class are set to access modifier "private",
so that they are not changed easily when accessed. Getters are called 
accessors and setters as mutators.

Getter and setters allow for encapsulation. Encapsulation is an oop's 
property by which the values(variables) and the their processes(methods) 
are put together in a single unit. To ensure encapsulation:

1. Declare class variables as private, so that once their values are set they 
can be used by different methods but their values need not change.

2. Provide public getter and setter methods for modifying the variables, 
when required.

Using setXXX() and getXXX(), the users need not know how data are stored 
in a class. The datatype of the class can change but the users need not change
their codes.

#### Wrapper Class:

Java is an object oriented programming language. The primitive datatypes in 
java does not fulfill the requirements of objects.Hence Java developed Wrapper 
classes to overcome this. 

The Wrapper classes are Integer for int, Double for double, Float for float, 
Byte for byte, Short for short, Long for long, Booleon for booleon and 
Character for char.

Ex:
```ruby
Integer x=5;
```
 
####Boxing and Unboxing:

When value of a primitive datatype is passed to a wrapper class,ie. conversion
to an object, its called boxing. This is done by the compiler. Unboxing is
the conversion of the value back to the primitive datatype. Unboxing is done 
under two circumstances:
 
 1. When a primitive datatype is passed to a method that is expecting an 
 an object, it is autoboxed to a wrapper class. And while returning from
 the method it is unboxed back to the datatype.
 
 2. Unboxing through assignment. Eg. getting value from list and assigning it to primitive reference type.
 
 
 Refer example of WrapperClass.
  














 