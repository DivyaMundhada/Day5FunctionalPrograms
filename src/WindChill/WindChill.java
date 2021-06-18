package WindChill;

import java.util.Scanner;

public class WindChill {

	double t, v;

	void calculateChill() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature value in Fahrenheit: ");
		double t = scan.nextDouble(); // t=temperature
		System.out.println("Enter the wind speed in miles per hour: ");
		double v = scan.nextDouble(); // v=wind speed
		scan.close();

		if (Math.abs(t) <= 50) {
			if (v >= 3 && v <= 120) {
				double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
				System.out.println("Wind chill value is: " + wind + " units.");
			} else
				System.out.println("Wrong input! wind speed cannot be larger than 120 or less than 3");
		} else
			System.out.println("Wrong input! temperatue cannot be larger than 50 in absolute value");
	}

	public static void main(String[] args) {
		WindChill obj = new WindChill();
		obj.calculateChill();

	}
}