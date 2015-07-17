public class SRM604 {

	public int howManyPairs(String[] words) {

		int c = 0;
		boolean test;

		for (int i = 0; i < words.length; i++)
			for (int m = i + 1; m < words.length; m++) {
				test = false;
				for (int n = 1; n < words[i].length(); n++) {
					String a = words[i].substring(0, n);
					String b = words[i].substring(n);
					if (words[m].equals(b + a)) {
						test = true;
						break;
					}
				}
				if (test)
					c++;
			}

		return c;
	}

}
