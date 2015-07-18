import java.util.Arrays;

public class SRM600 {

	public int getLeastCost(int[] cnt, int baseCost, int seatCost) {

		Arrays.sort(cnt);
		int A = Integer.MAX_VALUE;

		for (int i = 1; i <= cnt[cnt.length - 1]; i++) {
			int bus = 0;
			for (int m = 0; m < cnt.length; m++) {
				int man = cnt[m];
				while (man > 0) {
					man -= i;
					bus++;
				}
			}
			A = Math.min(A, bus * (baseCost + (i * seatCost)));
		}

		return A;
	}

}
