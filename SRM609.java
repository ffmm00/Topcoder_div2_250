public class SRM609 {

	public int minimalMoves(String S) {

		int c = 0;

		for (int i = 0; i < S.length() / 2; i++) {
			if (S.charAt(i) == '<')
				c++;
		}

		for (int i = S.length() / 2; i < S.length(); i++) {
			if (S.charAt(i) == '>')
				c++;
		}

		return c;
	}

}
