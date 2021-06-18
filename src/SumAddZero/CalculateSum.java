package SumAddZero;

import java.util.Scanner;

public class CalculateSum {
	static Scanner scan = new Scanner(System.in);
	int len;

	void InputArray() {
		int array[] = new int[len];
		System.out.println("Enter the values: ");
		for (int i = 0; i < len; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.print(array[i] + " " + array[j] + " " + array[k]);
						System.out.print("\n");
					}

				}
			}
		}
	}

	public static void main(String[] args) {
		CalculateSum obj = new CalculateSum();
		System.out.println("Enter length of your array: ");
		obj.len = scan.nextInt();
		obj.InputArray();

	}
}
