public class SRM564 {

	public String classifyIt(String word) {

		int n = word.length();

		boolean palin = true, faux = true;

		for (int i = 0, j = n - 1; i < j; ++i, --j) {
			if (word.charAt(i) != word.charAt(j)) {
				palin = false;
				break;
			}
		}

		StringBuilder s = new StringBuilder();

		s.append(word.charAt(0));

		for (int i = 1; i < n; i++)
			if (word.charAt(i) != word.charAt(i - 1))
				s.append(word.charAt(i));

		n = s.length();

		for (int i = 0, j = n - 1; i < j; ++i, --j)
			if (s.charAt(i) != s.charAt(j)) {
				faux = false;
				break;
			}

		if (palin)
			return "PALINDROME";

		if (faux)
			return "FAUX";

		return "NOT EVEN FAUX";

	}

}
