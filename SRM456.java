public class SRM456 {

	public int minRep(String word) {

		if (word.length() < 5)
			return -1;

		word = word.toLowerCase();

		int c = 0;

		if (!word.startsWith("a"))
			c++;

		if (word.charAt(word.length() - 2) != 'l')
			c++;

		if (word.charAt(word.length() - 1) != 'e')
			c++;

		for (int i = 1; i < word.length() - 2; i++) {
			if (word.charAt(i) != 'p')
				c++;
		}

		return c;
	}

}
