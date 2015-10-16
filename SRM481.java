public class SRM481 {

	public int makePurchases(int[] open, int[] close, int travel) {

		int max = -1;

		for (int c : close)
			max = Math.max(max, c);

		int time = 0;
		int store = 0;

		boolean visit[] = new boolean[open.length];

		int num = 0;

		while (time <= max) {
			if (!visit[store] && time >= open[store] && time <= close[store]) {
				visit[store] = true;
				num++;
			}
			store = (store + 1) % visit.length;
			time += travel;
		}

		return num;
	}

}
