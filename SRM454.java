public class SRM454 {

	public int findNumber(int A, int B, int C) {

		int c = sum(C);

		int ans = -1;
		int min = Integer.MAX_VALUE;

		for (int i = A; i <= B; i++) {
			int temp = Math.abs(sum(i) - c);
			if (temp < min) {
				min = temp;
				ans = i;
			}
		}

		return ans;
	}

	int sum(int a) {
		int res = 0;
		while (a != 0) {
			res += a % 10;
			a /= 10;
		}
		return res;
	}

}
