import java.util.HashMap;

public class SRM670 {

	public int rescount(int[] a, int[] b) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int n1 = 0, n2 = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int tempA = a[i];
				int tempB = b[j];
				b[j] = tempA;
				a[i] = tempB;
				n1 = 0;
				n2 = 0;

				for (int n : a) {
					n1 += n;
				}
				for (int n : b) {
					n2 += n;
				}

				map.put(n1 * n2, 1);

				b[j] = tempB;
				a[i] = tempA;

			}
		}

		return map.size();
	}

}
