public class SRM598 {

	public String simulate(String s) {

		boolean test = true;
		String SA="";

		while (test) {
			test = false;
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					s = s.substring(0, i) + s.substring(i + 2);
					test = true;
				}
			}
		}

		return s;
	}

}
