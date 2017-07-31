## Recap:
Getters and  setters are used to access private variables of a class. They 
allow for encapsulation. The primitive datatypes in java are does not fulfil 
the requirements of objects. Hence java developed Wrapper class.

------------------------- End of Recap ------------------------

#### Decision making statements
###### if- else if - else
Decisions are important for any programming language.
Imagine a situation when you need to check a condition before doing the next step in the program.

Lets write a program which resets a variable to 0 if the value of the variable is greater than 5.

```ruby
package com.chap7;

import java.util.Scanner;

public class Decision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String val = sc.next();
		
		// converting string to integer
		int intVal = Integer.parseInt(val);
		 
		if(intVal > 5) {
			intVal = 0;
		}
		
		System.out.println("value is "+intVal);
		sc.close();
	}
 
}
```

In a decision tree there could be more than one outcomes or alternative routes.
For this we have the if-else if - else statements.

** Refer to Decision.java.

##### increment and decrement operators

Increment operation is adding "an integer" to existing value.

Increment can be represented in a couple of ways.

``` ruby
int i = 3;
int y = 9;

System.out.println("i = "+i+", y = "+y);
i = i + 1; // basic way of increment
y = y - 1; // basic way of decrement
System.out.println("i = "+i+", y = "+y);

i+=2; 
y-=3; 
System.out.println("i = "+i+", y = "+y);

```

##### Pre and Post (increment and decrement)
** Refer to PrePost.java
