public class SRM658 {

	public String equal(String s, String t) {

		int A = s.length();
		int B = t.length();

		String s2 = "";
		String t2 = "";

		for (int i = 0; i < A; i++)
			t2 += t;

		for (int i = 0; i < B; i++)
			s2 += s;

		if (s2.equals(t2))
			return "Equal";

		return "Not equal";

	}
}
