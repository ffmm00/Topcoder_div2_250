public class SRM557 {

	public int minHP(int[] dps, int[] hp) {

		int total = 0;
		int loss = 0;

		for (int n : dps)
			total += n;

		for (int i = 0; i < dps.length; i++) {
			loss += total * hp[i];
			total -= dps[i];
		}

		return loss;
	}

}
