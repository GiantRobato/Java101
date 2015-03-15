/*	Title:	Lesson 2

	Description: This program demonstrates how to do simple math operations
	as well as some simple variable types

	Goal: Run this program to understand how math operations work

	Try this: See challenge below

*/

public class Lesson2{

	public static void main(String[] args) {

		//This is how we instantiate a number
		int number;

		//This is another way we can instantiate a number
		int num = 4;

		//examples of simple math operations
		int n1 = 2 + 3;
		int n2 = 4 * 3;
		int n3 = 8 / 2;
		int n4 = 6 - 9;

		//You can print variables out too!
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

		//Challenge
		//Calculate how many coins you have and print it out
		//Advanced: also print out how much value given that
		//		1g (gold) = 10s (silver)
		//		1s (silver) = 10c (copper)

		int c = 4;
		int s = 6;
		int g = 1;

		//edit this!
		int total;

		//Advanced
		//int totalValue;

		//This should print out 11
		System.out.println("The total number of coins you have is: " + total);

		//Advanced
		//System.out.println("The total value you have is: " + totalValue);

	}
}