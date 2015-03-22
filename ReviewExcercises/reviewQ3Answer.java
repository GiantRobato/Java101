import java.text.DecimalFormat; //so we can set precision for double
import java.util.Scanner;

public class reviewQ3Answer {

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
	}
	
}
