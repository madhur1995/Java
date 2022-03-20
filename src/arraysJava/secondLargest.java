package arraysJava;

import java.util.*;

public class secondLargest {

	public static void main(String[] args) {
		int arr[] = { 10,5,10 };
		
		System.out.println(arr.length);
		int n = arr.length;
		print2largest(arr, n);

	}

	private static void print2largest(int[] arr, int arr_size) {

		int i;

		if (arr_size < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}

		Arrays.sort(arr);
		for (i = arr_size - 2; i >= 0; i--) {
			
			if (arr[i] != arr[arr_size - 1]) {
				System.out.printf("The second largest " + "element is %d\n", arr[i]);
				return;
			}
		}

		System.out.printf("There is no second " + "largest element\n");

	}

}
