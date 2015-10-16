public class SRM479 {

	public int find(int[] flights, int fuel) {

		int c = 0;
		int b = 0;

		for (int a : flights) {
			b += a;
			if (b > fuel)
				break;
			c++;
		}

		return c;
	}

}
