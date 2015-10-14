public class SRM485 {

	public int mostAttractivePrice(int min, int max) {

		int num = -1;
		int ans = -1;

		for (int i = min; i <= max; i++) {
			int temp = trail(i);
			if (temp >= num) {
				num = temp;
				ans = i;
			}
		}

		return ans;
	}

	int trail(int a) {
		int c = 0;
		while (a % 10 == 9) {
			c++;
			a /= 10;
		}

		return c;

	}

}
