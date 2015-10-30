public class SRM449 {

	public double findDistance(int[] start, int[] finish) {

		int st = Integer.MAX_VALUE;
		int go = Integer.MIN_VALUE;

		for (int a : start) {
			st = Math.min(st, a);
		}

		for (int a : finish) {
			go = Math.max(go, a);
		}

		return Math.sqrt(2) * (go - st);
	}

}
