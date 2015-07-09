public class SRM630 {

	public String ableToSolve(String S) {

		while (true) {
			boolean a = true;
			for (int i = 0; i < S.length() - 1; i++) {
				if (S.charAt(i) == S.charAt(i + 1)) {
					a = false;
					S = S.substring(0, i) + S.substring(i + 2);
					break;
				}

			}
			if (S.equals(""))
				return "Possible";

			if (a)
				return "Impossible";
		}
	}

}
