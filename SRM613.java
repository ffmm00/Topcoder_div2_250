public class SRM613 {

	public String getAnswer(String S) {

		int c = 0;
		int a = 0;
		int t = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'C')
				c++;
			if (S.charAt(i) == 'A' && c == 1)
				a++;
			if (S.charAt(i) == 'T' && c == 1 && a == 1)
				t++;
			if (S.charAt(i) == 'A' && c == 0)
				return "Impossible";
			if (S.charAt(i) == 'T' && c == 0)
				return "Impossible";
		}

		if (c == 1 && a == 1 && t == 1)
			return "Possible";

		return "Impossible";
	}

}
