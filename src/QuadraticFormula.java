public class QuadraticFormula {

	public QuadraticFormula(){
		
	}
	
	public void CalculateFormula(double a, double b, double c) {
		double disc = (b * b) - (4 * a * c);
		double quadMin = (-b - Math.sqrt(disc)) / (2 * a);
		double quadAdd = (-b + Math.sqrt(disc)) / (2 * a);

		if (disc < 0) {
			System.out.println("You entered the equation:" + a + "x^2 + " + b
					+ "x + " + c + " = 0");
			System.out.println("There are no real roots");
		}

		else if (disc == 0) {
			System.out.println("You entered the equation:" + a + "x^2 + " + b
					+ "x + " + c + " = 0");
			if (quadMin == quadAdd) {
				System.out.println("There is a double root: " + quadMin);
			} else {
				System.out.println("error");
			}
		}

		else if (disc > 0) {
			System.out.println("You entered the equation:" + a + "x^2 + " + b
					+ "x + " + c + " = 0");
			System.out.println("There are two real roots: " + quadMin + " and "
					+ quadAdd);
		}

	}
}
