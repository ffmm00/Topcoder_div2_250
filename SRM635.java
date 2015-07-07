public class SRM635 {

	public String check(String s, String t) {

		int i = 0;

		for (int m = 0; m < s.length(); m++) {
			if (i == t.length())
				break;

			if (t.charAt(i) == s.charAt(m)) {
				i++;
			}
		}

		if (i == t.length()) {
			return "Yep, it's wood.";

		}

		return "Nope.";
	}

}
