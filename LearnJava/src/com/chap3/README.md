## Recap of variables/attributes and Integer datatype
The last class we discussed about variables and integer datatypes.
We also discussed about a problem statement i.e. swapping two integers using the 2 below ways:
1. Using 3rd variable.
2. Without Using 3rd variable.

Algorithmic Solutions are as below:

1. Using 3rd Variable
    - c = a;
    - a = b;
    - b = c;
2. Without using 3rd variable
    - a = a + b
    - b = a - b
    - a = a - b
    
##### ------------- End of Recap ----------------

#### Other primitive datatypes
"int", as discussed is one of the primitive datatypes.
There are other primitive datatypes too.
Lets start with the example we discussed last day for int.
Remember,
```ruby
 int i1 = 23;
 int i11 = i1/10;
 System.out.println(i11);
```
We used to get the result as 2 instead of 2.3 which was obviously expected.
This anamoly is because integer (int) is not designed to handle numbers with decimals.
The way java solves such scenarios is by using decimal data types.
1. Float
2. Double

```
float f = 22;
System.out.println(f); // Result is 22.0
```
```
double d = 22;
System.out.println(d); // Result is 22.0
```
Both above datatypes convert the simple whole numbers to decimal numbers automatically.
######Why do we need 2 datatypes for decimal?
| float  | double |
| ------------- | ------------- |
| single-precision 32-bit IEEE 754 floating point  | double-precision 64-bit IEEE 754 floating point  |
| mainly used to save memory in large arrays of floating point numbers  | generally used as the default data type for decimal values, generally the default choice  |
| Default value is 0.0f  | Default value is 0.0d  |
| Example: float f1 = 234.5f  | Example: double d1 = 123.4  |

You can observe that when we need to assign value 123.4 to a double variable we just need to write _double d1 = 123.4_ 
while if I need to assign it to a float variable we must give so _float f1 = 123.4f_, otherwise it gives a compilation
error "Incompatible datatypes".

The default datatype for whole numbers is integer and for decimal (floating point numbers) is **double**.
 
Now lets take a simple scenario (Scenario 1)
```
int a = 11;
double d = a/10;
System.out.println(d);
```
The output is still gonna be **1** and NOT 1.1.
This is because the mathematical calculation happens before assignment of value to variable. As soon as the mathematical
calculation is done the value becomes 1 (because the calculation is an integer calculation) after which it is assigned
to a double hence resultant value 1 becomes 1.0.

###### How do we solve this problem?
The mathematical calculation must occur in double scope.
```
double a = 11;
double d = a/10;
System.out.println(d);
```
The other way is using **Type Casting**.

##### What is TypeCasting?
Conversion of value of one datatype to another data type is called as type casting.
This is of 2 types:
1. Implicit type casting: The process as a result of which the compiler understands the type casting implicitly is
called implicit type casting. Here there is hardly any change in syntax to the literal condition.

````
int i = 2;
float a = i;
System.out.println(a);
````
Here i as an integer is converted to a which is float implicitly.

###### What is the reverse?
```$ruby
float f = 2.2f;
int i = f; // Compile time error
System.out.println(i);
```
Here it gives a compile time error of "Incompatible types" the reason being **int is a narrower data type as compared to
float**.

The same is the case for converting double to float.
The widening order is as follows:
* byte or char
* short
* int
* long
* float
* double

where byte is the narrowest datatype and double is the widest.
Implicit typecasting can occur from narrower to wider but not otherwise.

2. Explicit typecasting: This is process of explicitly converting to target datatype before actually assigning it.
Eg:
```$xslt
float f = 2.2f;
int i = (int)f; 
System.out.println(i);
```
This time we do not have any compile time or run time errors and the result is 2.
Now lets solve Scenario 1 using explicit typecasting
```
int a = 11;
double d = (double)a/10;
System.out.println(d);
```
The result is **1.1** which is the expected result.

As discussed the other datatypes are as follows:
1. byte which can be used for positive or negative numbers in the range -127 to 128.
2. char which can be used for positive number between 0 to 255
Note: byte and char are interconvertible
Eg:
```$xslt
byte a = 65;
System.out.println(a); // prints 65
char b = 'B';
System.out.println(b); // prints B
b = (char)a;
System.out.println(b); // prints A
```

The following table gives such a list of byte to char transformations:


| Decimal | Value | Description |
| ------- | ----- | ----------- |
|	0	|	NUL	|	"null" character
|	1	|	SOH	|	start of header
|	2	|	STX	|	start of text
|	3	|	ETX	|	end of text
|	4	|	EOT	|	end of transmission
|	5	|	ENQ	|	enquiry
|	6	|	ACK	|	acknowledgment
|	7	|	BEL	|	bell
|	8	|	BS	|	backspace
|	9	|	HT	|	horizontal tab
|	10	|	LF	|	line feed
|	11	|	VT	|	vertical tab
|	12	|	FF	|	form feed
|	13	|	CR	|	carriage return
|	14	|	SO	|	shift out
|	15	|	SI	|	shift in
|	16	|	DLE	|	data link escape
|	17	|	DC1	|	device control 1 (XON)
|	18	|	DC2	|	device control 2
|	19	|	DC3	|	device control 3 (XOFF)
|	20	|	DC4	|	device control 4
|	21	|	NAK	|	negative acknowledgement
|	22	|	SYN	|	synchronous idle
|	23	|	ETB	|	end of transmission block
|	24	|	CAN	|	cancel
|	25	|	EM	|	end of medium
|	26	|	SUB	|	substitute
|	27	|	ESC	|	escape
|	28	|	FS	|	file separator
|	29	|	GS	|	group separator
|	30	|	RS	|	request to send/record separator
|	31	|	US	|	unit separator
|	32	|	SP	|	space
|	33	|	!	|	exclamation mark
|	34	|	"	|	double quote
|	35	|	#	|	number sign
|	36	|	$	|	dollar sign
|	37	|	%	|	percent
|	38	|	&	|	ampersand
|	39	|	'	|	single quote
|	40	|	(	|	left/opening parenthesis
|	41	|	)	|	right/closing parenthesis
|	42	|	*	|	asterisk
|	43	|	+	|	plus
|	44	|	,	|	comma
|	45	|	-	|	minus or dash
|	46	|	.	|	dot
|	47	|	/	|	forward slash
|	48	|	0	|	
|	49	|	1	|	
|	50	|	2	|	
|	51	|	3	|	
|	52	|	4	|	
|	53	|	5	|	
|	54	|	6	|	
|	55	|	7	|	
|	56	|	8	|	
|	57	|	9	|	
|	58	|	:	|	colon
|	59	|	;	|	semi-colon
|	60	|	<	|	less than
|	61	|	=	|	equal sign
|	62	|	>	|	greater than
|	63	|	?	|	question mark
|	64	|	@	|	"at" symbol
|	65	|	A	|	
|	66	|	B	|	
|	67	|	C	|	
|	68	|	D	|	
|	69	|	E	|	
|	70	|	F	|	
|	71	|	G	|	
|	72	|	H	|	
|	73	|	I	|	
|	74	|	J	|	
|	75	|	K	|	
|	76	|	L	|	
|	77	|	M	|	
|	78	|	N	|	
|	79	|	O	|	
|	80	|	P	|	
|	81	|	Q	|	
|	82	|	R	|	
|	83	|	S	|	
|	84	|	T	|	
|	85	|	U	|	
|	86	|	V	|	
|	87	|	W	|	
|	88	|	X	|	
|	89	|	Y	|	
|	90	|	Z	|	
|	91	|	[	|	left/opening bracket
|	92	|	\	|	back slash
|	93	|	]	|	right/closing bracket
|	94	|	^	|	caret/circumflex
|	95	|	_	|	underscore
|	96	|	`	|	
|	97	|	a	|	
|	98	|	b	|	
|	99	|	c	|	
|	100	|	d	|	
|	101	|	e	|	
|	102	|	f	|	
|	103	|	g	|	
|	104	|	h	|	
|	105	|	i	|	
|	106	|	j	|	
|	107	|	k	|	
|	108	|	l	|	
|	109	|	m	|	
|	110	|	n	|	
|	111	|	o	|	
|	112	|	p	|	
|	113	|	q	|	
|	114	|	r	|	
|	115	|	s	|	
|	116	|	t	|	
|	117	|	u	|	
|	118	|	v	|	
|	119	|	w	|	
|	120	|	x	|	
|	121	|	y	|	
|	122	|	z	|	
|	123	|	{	|	left/opening brace
|	124	|	|	vertical bar    |
|	125	|	}	|	right/closing brace
|	126	|	~	|	tilde
|	127	|	DEL	|	delete  |

3. long : The datatype long is a wider version of int and can handle bigger values as compared to int.

| int | long  |
| --- | ----  |
| Int data type is a 32-bit signed two's complement integer. | Long data type is a 64-bit signed two's complement integer |
| Minimum value is - 2,147,483,648 (-2^31)  | Minimum value is -9,223,372,036,854,775,808(-2^63)  |
| Maximum value is 2,147,483,647(inclusive) (2^31 -1) | Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1) |
| Integer is generally used as the default data type for integral values unless there is a concern about memory.  | This type is used when a wider range than int is needed |
| The default value is 0  | Default value is 0L |
| Example: int a = 100000, int b = -200000  | Example: long a = 100000L, long b = -200000L  |

#### Referential datatypes
We did see but we haven't yet discussed about "**String**". This is because String is not a primitive datatype but it is 
a class and can be used as a Referential datatype. 
When you assign 
``` 
String a = "test";
```
It actually creates an object of String class and assigns it to a reference called "a".
The above statement is similar to the following:
```$xslt
String a = new String("test");
```
"new" is the keyword we use to create objects.
We will discuss more about String and Object creation in the future chapters.

###Methods or functions(Behaviours)
The conventional programming languages were more sequential in execution i.e. line 1 of code is followed by 2, 3 and so on.
The object oriented programming with java is **modularized**. This is brought by the **normalization** of the code.

The concept by virtue of which this is achieved is called division of responsibility.

Lets assume a situation where the Dog Class we discussed on Day 1 has to perform various functionalities or behaviours,
say it has to **getNewsPaperToBed**, followed by **barkToWakeTheMaster** followed by **guardTheDoor**. As you might notice
these are independent functions which are un-related. Hence we write the functions (called as **methods** in java) in the 
same class but as different methods.

As discussed earlier the trigger point of java program (from where the user can control the program) starts with a method called "main"
have the signature public static void where public is the access specifier, static is the modifier and most importantly void is
 the return type (returns nothing).
 
Hence the minimum requirement of a java program is return type.
Here is how a function looks like:
```$xslt
[access_specifier] [access_modifier] <return_type> <methodName> () {
    <method definition>;
    [return statement];
}

<>  --> mandatory
[]  --> optional
```

Line 1 is called the method signature or method declaration.
The content of a method is called method definition.

When we call a method from the main method, we should call by creating the object of the class in which the new method is
present (using a dot operator)

Eg:
```$xslt
Class Sample {
public static void main(String args[]) {    //1
 Sample sampleObj = new Sample();           //2
 String test = sampleObj.getMethod();       //3
 System.out.println(test);                  //7
 }
 
 public String getMethod() {                //4
  System.out.println("in getMethod");       //5
  return "hi, im back";                     //6
 }
}
```
Here again "new" keyword is used to create new object of class Sample which is assigned to a referential variable called "sampleObj".


The order of execution of statements is given alongside.
Here getMethod() has a returntype of String type. If return statement is missing it will give a compile time error.

There can be 2 types of methods:
1. Non-parameterized methods - Methods or functions which do not carry any argument or parameters.
Eg. getMethod() above.

2. Parameterized methods - Methods or functions which carry an argument or parameter.
Eg.
```$xslt
Class Sample {
public static void main(String args[]) {    //1
 Sample sampleObj = new Sample();           //2
 String test = sampleObj.getMethod(25);     //3
 System.out.println(test);                  //7
 }
 
 public String getMethod(int val) {         //4
  System.out.println("in getMethod"+val);   //5
  return "hi, im back";                     //6
 }
}
```

Here the value 25 (which is integer by default) is passed as argument. In the method the parameter **val** holds this value.
Run the program to see the output.