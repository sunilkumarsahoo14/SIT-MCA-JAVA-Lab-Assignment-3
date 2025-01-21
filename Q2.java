// Write a Java program to sort an array using bubble sort.

import java.util.Scanner;
class BubbleSort{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array: ");
		int n = sc.nextInt();
		int arr[] = new int [n];
		// Input Array Elements
		System.out.println("Enter "+n+" Array Elements.");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		// BubbleSort
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		// Display Sorted Array
		System.out.println("Sorted Array Elements Are: ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
