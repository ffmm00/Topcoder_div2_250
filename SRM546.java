public class SRM546 {

	public int getWinner(int[] events) {

		int max = -1, win = -1;

		int task[] = new int[1000001];

		for (int a : events) {
			task[a]++;
			if (task[a] > max) {
				win = a;
				max = task[a];
			}
		}

		return win;
	}

}
