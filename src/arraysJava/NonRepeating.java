package arraysJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { -1, 2, -1, 3, 2};
		int n = arr.length;

		int a = firstNonRepeating(arr, n);
		System.out.println(a);

	}

	private static int firstNonRepeating(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer x : arr) {
			if (map.containsKey(x))
				map.put(x, map.get(x) + 1);
			else
				map.put(x, 1);
		}
		Set<Map.Entry<Integer, Integer>> en = map.entrySet();
		for (Map.Entry<Integer, Integer> m : en) {
			if (m.getValue() == 1) {
				return (m.getKey());
			}

		}
		return 0;

	}

}
