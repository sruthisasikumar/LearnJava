## Recap:
If-else statements are used for decision making. An if-else statement has the 
syntax:

```ruby
if (condition){
   (if body)
 }else{
   (else body)
 }
 ```    
 
 Sometimes nested if-else statements are used.
 
 ```ruby
 if (condition){
    (if body)
  }else if(condition){
    (if body)
  }else {
    (else body)
  }
```

Increment operation is adding an integer to existing value, and decrement 
operations are to subtract an integer from a value.
There are post and pre- increment and decrement operations.

----------------- End of Recap --------------------

#### Looping Statements

Looping statements are used to ensure that a code statement is executed 
repeatedly as long as a specified condition is true. The condition is checked
for each loop. The loop is terminated when the condition check becomes false.

##### for loop:
'for' loop is one of the commonly used looping statements in java. Syntax for 
'for loop':

```ruby
for(<initialise variable> ; <condition check> ; <increment variable>){
    body of for loop
 }
 
 Ex: for(int i =0; i<5; i++)
```
Here the initial value of i(i.e.,0) is less than 5. As the condition is true the
loop starts and the value of i becomes 1. For the second run the value of i is
1, which is less than 5, and value of i is increased to 2. This loop keeps on 
executing until condition (i<5) is false, ie., when the value of i becomes 5,
the loop stops executing.

##### Enhanced for loop:
Enhanced for loop is used to traverse elements in a collection like an array.
Syntax:

```ruby
for(declaration:expression){
 body of for loop
}

Ex:
String[] num ={10,20,3,40,50};

for(int nums : num) {
System.out.println(nums);
}
```
Here all the values in the array 'num' are printed.  

##### while loop:
 while executes statements if the given condition is true. If the condition is
 false then the program does not enter the while loop. Syntax for while loop:
 
 ```ruby
while (condition){
  statements
}
```

##### do-while loop:
do-while is same as while loop except that the condition check is done at the end
of the loop. So even if the condition is false the loop runs once. Syntax:

```ruby
do{
statements
} while(condition);
```

#### Loop Control Statements:

Loop control statements are used to change the normal sequence of flow of control
of the program.

* break: When break statement is encountered, the control exits the loop 
and passes to the next following statements.

*continue: When continue statement is encountered it exits the current 
iteration. The control goes back to check the condition before reiteration.

