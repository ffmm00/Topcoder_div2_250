public class SRM509 {

	public int getMinimumCost(int X) {

		int c = 0;

		while (c < 1000001) {
			if (pali(X + c) || pali(X - c))
				return c;

			c++;
		}

		return c;
	}

	boolean pali(int n) {

		if (n < 0)
			return false;

		String s = n + "";

		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;

		return true;
	}

}
