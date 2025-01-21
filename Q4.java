/*
Write a Java program to find largest number of an array. Define a method public int
findMax(int nums[]), which will take an array as argument and return the largest
number. Initialize the array at the runtime.
*/

import java.util.Scanner;

class ArrayMaximumFind{
	//Find Max Method
	public int findMax(int num[]){
		int max = num[0];
		for(int i = 1; i < num.length; i++){
			if(num[i] > max){
				max = num[i];
			}
		}
		return max;
	}

	public int findMin(int num[]){
		int min = num[0];
		for(int i = 1; i < num.length; i++){
			if(num[i] < min){
				min = num[i];
			}
		}
		return min;
	}
	
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
		// Object Create And findMax Method Call...
		ArrayMaximumFind amf= new ArrayMaximumFind();
		int maximum = amf.findMax(arr);
		System.out.println("Maximum Of The Array Is: "+maximum);

		int minimum = amf.findMin(arr);
		System.out.println("Maximum Of The Array Is: "+minimum);
	}
}
