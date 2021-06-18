package TwoDArray;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Rows ");
		int M = scan.nextInt();
		System.out.println("Enter the number of an Columns ");
		int N = scan.nextInt();
		int array[][] = new int[M][N];

		System.out.println("Enter " + M * N + " elements to store in Array: ");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		scan.close();
		System.out.println("Elements in Array are:\n");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
