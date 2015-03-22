#Cheat Sheet

This is a cheat sheet for common programming things in java.

##Outline

* [Bare Minimum Code](#bare-minimum)
* [Creating and Using Variables](#variables)

##Bare Minimum
This is the bare minimum you need to get a program working in java:

```
\\filename: myProgram.java

public class myProgram {

	public static void main(String[] args) {

		//code goes here	
	}
}
```

## Variables
Common variable types and how to instantiate them:

```
//countable numbers
int n;
n = 2;
int num1, num2, num3;
int j = 4;

//decimal numbers
double d;
d = 6.8;
double weight, percentage;
double r = 3.4;

String fname = "fun name";
String words;
words = "more words!";
```

## Getting Input

```
//Need this in order to get input
import java.util.Scanner;

public class myProgram {

	public static void main(String[] args) {

		//This means we are getting input from the console
		Scanner input = new Scanner(System.in);

		//Integers
		int n;

		System.out.println("This is how you get an integer input");
		System.out.print("Please type in an integer: ");

		n = input.nextInt();

		System.out.println("You just typed: " + n);

		//Doubles
		double d;

		System.out.println("This is how you get a double input");
		System.out.print("Please type in a double: ");

		d = input.nextInt();

		System.out.println("You just typed: " + d);

		//Strings
		String s;

		System.out.println("This is how you get a String input");
		System.out.print("Please type in a String: ");

		s = input.nextLine();

		System.out.println("You just typed: " + s);

	}
}

```





