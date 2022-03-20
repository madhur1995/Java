package arraysJava;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Geeks";
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			s1 = s.charAt(i)+s1;
		}

		System.out.println(s1);

	}

}
