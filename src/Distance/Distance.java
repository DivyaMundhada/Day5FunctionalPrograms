package Distance;

import java.util.Scanner;

public class Distance {
	int x, y;

	void CalDistance() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Coordinates of the point: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		double result = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
		System.out.println("The Euclidean distance from the point to the origin is " + result + "units");
	}

	public static void main(String[] args) {
		Distance obj = new Distance();
		obj.CalDistance();
	}

}
