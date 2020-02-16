 

## Array
An array is a group of like-typed variables that are referred to by a common name.Arrays in Java work differently than they do in C/C++. Following are some important point about Java arrays.

In Java all arrays are dynamically allocated.(discussed below)
Since arrays are objects in Java, we can find their length using member length. This is different from C/C++ where we find length using sizeof.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered and each have an index beginning from 0.
Java array can be also be used as a static field, a local variable or a method parameter.
The size of an array must be specified by an int value and not long or short.
The direct superclass of an array type is Object.

## Multithreading
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.

Threads can be created by using two mechanisms :
1. Extending the Thread class
2. Implementing the Runnable Interface

## Enhanced loop
Java provides three ways for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.

while loop: A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement.
Syntax :
while (boolean condition)
{
   loop statements...
}

for loop: for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.
Syntax:
for (initialization condition; testing condition; 
                              increment/decrement)
{
    statement(s)
}
do while: do while loop is similar to while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop.
Syntax:
do
{
    statements..
}
while (condition);