package java101;

import java.text.DecimalFormat; //so we can get formatted text
import java.util.Scanner;

public class reviewQ3bAnswer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00000");
		
		double h, BMI;
		int weight;
		
		System.out.print("Your height in m: ");
		h = input.nextDouble();
		
		System.out.print("Your weight in kg: ");
		weight = input.nextInt();
	
		BMI = weight / (h * h);
		
		System.out.println("\nYour BMI is: " + df.format(BMI));

		String category;
		if(BMI < 18.5){
			category = "underweight";
		} else if (BMI < 25){
			category = "normal weight";
		} else if (BMI < 30){
			category = "overweight";
		} else {
			category = "obese";
		}
		
		System.out.print("BMI Category is: " + category);		
			
	}
	
}
