public class SRM536 {

	public int countRoots(int[] a) {

		int p0 = a[0], p1 = 0;

		for (int i = 0; i < a.length; ++i) {
			p1 += a[i];
		}

		if (p0 % 2 == 0 && p1 % 2 == 0)
			return 2;
		if (p0 % 2 == 0 && p1 % 2 != 0)
			return 1;
		if (p0 % 2 != 0 && p1 % 2 == 0)
			return 1;

		return 0;
	}

}
