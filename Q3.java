/*Write a Java program to find an element is present in the array or not.
Initialize the array at the run time. Also take the number to be search as user input.*/

import java.util.Scanner;

class SearchArrayElement {
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
		// Search Element
		int index = 0;
		System.out.println("Enter The Element To Search In Array: ");
		int ele = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (arr[i] == ele) {
				index = i + 1;
			}
		}
		if (index == 0) {
			System.out.println("Element Not Present In the Array!");
		} else {
			System.out.println("Element Present In The " + index + " Position");
		}
	}
}