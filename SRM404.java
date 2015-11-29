public class SRM404 {
	public static int countBooks(String[] readParts) {

		int c = 0;

		for (int i = 0; i < readParts.length; i++) {
			int c1 = 0, c2 = 0, c3 = 0;
			for (int j = i; j < i + 3 && j < readParts.length; j++) {
				if (readParts[j].equals("story"))
					c1++;
				else if (readParts[j].equals("introduction"))
					c2++;
				else if (readParts[j].equals("edification"))
					c3++;
			}
			if (c1 == 1 && c2 == 1 && c3 == 1) {
				c++;
				i += 2;
			}
		}

		return c;
	}

}
