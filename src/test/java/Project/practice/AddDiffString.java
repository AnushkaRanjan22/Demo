package Project.practice;

public class AddDiffString {
	public static void main(String[] args) {
		String a = "abcd";
		String b = "cdef";

		if ((a + a).contains(b))
			System.out.println(a + a);

		else
			System.out.println("Not rotable");

	}
}