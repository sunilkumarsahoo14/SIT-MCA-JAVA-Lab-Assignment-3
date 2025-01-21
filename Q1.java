// Write a Java program to store 10 numbers in an array and display them. Initialize the array at the runtime.

import java.util.Scanner;

class ArrayDisplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		// Input Array Elements
		System.out.println("Enter " + n + " Array Elements.");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// Disply Array Elements
		System.out.println("Array Elements Are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}