package arraysJava;

import java.util.Arrays;

public class MissingNo {

	public static void main(String[] args) {

		int N = 5;
		int A[] = { 1, 2, 3, 5 };
		int a=missingNumber(A, N);
		System.out.println(a);

	}

	private static int missingNumber(int[] a, int n) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != i + 1) {
				return i + 1;
			}
		}
		return (a.length + 1);
	}

}
