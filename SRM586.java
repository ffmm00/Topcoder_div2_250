public class SRM586 {

	public String simulate(int[] preference1, int[] preference2) {

		int n = preference1.length;
		char[] res = new char[n];

		boolean[] was = new boolean[n];

		for (int i = 0; i < n; i++) {
			int[] p = i % 2 == 0 ? preference1 : preference2;
			for (int k = 0; k < n; k++) {
				int x = p[k] - 1;
				if (!was[x]) {
					was[x] = true;
					res[x] = i % 2 == 0 ? '1' : '2';
					break;
				}
			}
		}

		return new String(res);
	}

}
