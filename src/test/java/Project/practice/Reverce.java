package Project.practice;

public class Reverce {
	public static void main(String[] args) {

		String s = "My Name Is Anushka Ranjan";

		System.out.println(s);

		String result = "";
		String[] arr = s.split(" ");

		for (String x : arr) {
			String rev = "";
			for (int i = x.length() - 1; i >= 0; i--) {
				rev = rev + x.charAt(i);
			}
			result = result + rev + " ";

		}
		System.out.print(result.trim());
	}
}
