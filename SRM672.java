public class SRM672 {

	public String compareSets(int[] a, int[] b) {

		int c = 0;

		for (int n1 : a) {
			for (int n2 : b) {
				if (n1 == n2)
					c++;
				if (a.length < b.length && c == a.length)
					return "LESS";
				if (a.length > b.length && c == b.length)
					return "GREATER";
				if (c == a.length && c == b.length)
					return "EQUAL";
			}
		}

		return "INCOMPARABLE";
	}

}
