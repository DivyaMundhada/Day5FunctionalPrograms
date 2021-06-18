package Quadratic;

import java.util.Scanner;

public class Quadratic {
	int a, b, c;

	void Calculation() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of a , b and c for the quadratic equation: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		double delta = (b * b) - (4 * a * c);
		double root1 = ((-b + Math.sqrt(delta)) / (2 * a));
		double root2 = ((-b - Math.sqrt(delta)) / (2 * a));
		System.out.println("The roots of the given quadratic equation are " + root1 + " and " + root2);
	}

	public static void main(String[] args) {
		Quadratic obj = new Quadratic();
		obj.Calculation();
	}

}
