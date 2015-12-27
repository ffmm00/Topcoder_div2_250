public class SRM674 {
	public static String RelationClassifler(int[] domain, int[] range) {

		int[] xy = new int[101];
		int[] yx = new int[101];

		int n = domain.length;

		for (int i = 0; i < n; i++) {
			int x = domain[i];
			int y = range[i];

			if (xy[x] != 0 && xy[x] != y)
				return "Not";

			if (yx[y] != 0 && yx[y] != x)
				return "Not";

			xy[x] = y;
			yx[y] = x;

		}

		return "Bijection";
	}

}
