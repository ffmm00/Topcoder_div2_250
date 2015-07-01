public class SRM647 {

	public String makeLine(int[] x) {

		int[] cnt = new int[26];
		int max = 0;
		for (int a : x) {
			cnt[a]++;
			max = Math.max(max, cnt[a]);
		}

		if (max > (x.length + 1) / 2)
			return "impossible";

		return "possible";
	}

}
