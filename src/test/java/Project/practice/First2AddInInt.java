package Project.practice;

public class First2AddInInt {
	public static void main(String[] args) {
		int n = 3427854;
		while (n >= 10) {
			String s = Integer.toString(n);
			int sum = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1));

			if (sum >= 10) {
				sum = (sum / 10) + (sum % 10);
			}
			s = sum + s.substring(2);
			n = Integer.parseInt(s);

			System.out.println("final output : " + n);
		}
	}
}
