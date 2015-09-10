public class SRM548 {

	public int minDucks(int[] duckTypes) {

		int[] duck = new int[51];
		int ans = 0;
		int max = 0;

		for (int a : duckTypes) {
			duck[a]++;
		}

		for (int i = 0; i <= 50; i++) {
			if (duck[i] != 0)
				ans++;
			if (duck[i] > max)
				max = duck[i];
		}

		return ans * max;

	}

}
