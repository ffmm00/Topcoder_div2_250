public class SRM491 {

	public int getSmallest(int N) {

		String n = N + "";

		char[] c = n.toCharArray();

		if (N == 0)
			return 1;
		if (n.length() == 1)
			return 0;

		for (char a : c) {
			if (a != 0) {
				a = 0;
				break;
			}
		}

		int count = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0) {
				count = i;
				break;
			}
		}

		String s = "";

		for (int i = count + 1; i < c.length; i++) {
			s += c[i];
		}

		return Integer.parseInt(s);
	}

}
