import java.util.Scanner;

public class QuadraticUI {

	private static Scanner kbrd = new Scanner(System.in);
	private static double a;
	private static double b;
	private static double c;

	public static void main(String[] args) {
		QuadraticFormula quad = new QuadraticFormula();
		String input;
		
		while (true) {
			System.out
					.println("This program solves the quadratic equation: ax^2 + bx + c = 0");
			System.out.println("Enter the coefficents a, b, and c:");
			System.out.println("a:");
			a = kbrd.nextDouble();
			System.out.println("b:");
			b = kbrd.nextDouble();
			System.out.println("c:");
			c = kbrd.nextDouble();
			quad.CalculateFormula(a, b, c);
			System.out.println();
			System.out.println("would you like to quit?");
			input = kbrd.next();
			if (input == "yes"){
				System.out.println("Thank you for using QuadSolver!");
				System.exit(0);
			}
		}
		
	}

}
