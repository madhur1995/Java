package arraysJava;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 5, 15 };
		int b[] = { 20, 3, 2 };

		int asize = a.length;
		int bsize = b.length;

		int c1 = asize + bsize;

		int[] c = new int[c1];

		System.arraycopy(a, 0, c, 0, asize);
		System.arraycopy(b, 0, c, asize, bsize);

		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

}
