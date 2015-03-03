package tuition;
import java.util.Scanner;

public class UDtuition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// Get tuition cost and set it as initial price
		System.out.println( "Enter initial tuition cost: ");
		double initialPrice = input.nextDouble();
	//Get percentage as a whole number and set it as percentInc1
		System.out.println( "Enter percentage as whole number: ");
		double percentInc1 = input.nextDouble();
	//Use percentInc1 to convert to decimal and called it percentInc2
		double percentInc2 = percentInc1 / 100;
	//Use sum as a reference to initialPrice
		double sum = initialPrice;
	//Created a count for below
		double count = 0;
	//This will get the price of 2nd through 4th year of college
		for(int z = 0; z < 3; z++){
			sum = sum + (sum * percentInc2);
			count = count + sum;
		}
	//Since we do not include first year tuition above, this includes it here for total
		double total = count + initialPrice;
		System.out.printf("Your total cost of tuition for 4 years is: %.2f", total);
	}
}