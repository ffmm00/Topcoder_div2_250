public class SRM452 {

	public int minCartons(int n) {

		int c = 0;

		for (int i = 0; i < 100; i++)
			for (int j = 0; j < 100; j++) {
				if (i * 6 + j * 8 == n) {
					c += i + j;
					return c;
				}
			}

		return -1;
	}

}
