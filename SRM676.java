public class SRM676 {
	public static int minTime(int[] time, int[] cost, int coin) {

		int sum = 0;
		int temp = 0;

		for (int i = 0; i < time.length; i++) {
			for (int j = i + 1; j < time.length; j++) {
				if (cost[i] > cost[j]) {
					temp = cost[i];
					cost[i] = cost[j];
					cost[j] = temp;

					temp = time[i];
					time[i] = time[j];
					time[j] = temp;
				}
			}
		}

		for (int i = 0; i < time.length; i++) {
			sum += time[i];
			temp = Math.min(time[i], coin / cost[i]);
			coin -= cost[i] * temp;
			sum -= temp;
		}

		return sum;
	}
}
