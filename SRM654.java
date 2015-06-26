public class SRM654 {

	public int getscore(String s) {

		int C = 0;

		for (int i = 0; i < s.length(); i++) {
			C++;
			for (int m = i + 1; m < s.length(); m++) {
				if (s.charAt(i) == s.charAt(m))
					C++;
				else
					break;
			}
		}

		return C;
	}

}
