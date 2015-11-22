public class SRM424 {
	public static String fixTheSpell(String s) {

		StringBuffer de = new StringBuffer(s);

		int low = 0;
		int upp = de.length() - 1;

		while (low < upp) {
			low = Math.min(convert(de.indexOf("A", low)),
					convert(de.indexOf("Z", low)));
			if (low >= upp)
				break;

			upp = Math.max(convert(de.indexOf("A", upp)),
					convert(de.indexOf("Z", upp)));
			if (low >= upp)
				break;

			char temp = de.charAt(low);
			de.setCharAt(low, de.charAt(upp));
			de.setCharAt(upp, temp);
			low++;
			upp++;
		}

		return de.toString();
	}

	static int convert(int n) {
		return (n < 0) ? Integer.MAX_VALUE : n;
	}

}
