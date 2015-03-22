import java.util.Scanner;

public class reviewQ2Answer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] relGrav = {0.78, 0.39, 2.65, 1.17, 1.05, 1.20};

		int weight;
		
		System.out.print("Please enter the weight that you tell people: ");
		weight = input.nextInt();
		
		//display choices
		System.out.println("\n\t1. Venus\t2. Mars\t\t3. Jupiter");
		System.out.println("\t4. Saturn\t2. Uranus\t3. Neptune\n");
		System.out.print("Which planet do you want to visit? ");
		
		//get input
		int planet;
		planet = input.nextInt();
		
		//calculate weight and display
		double newWeight = weight * relGrav[planet - 1];
		System.out.println("\nYour weight would be " + newWeight);
		
	}
	
}
