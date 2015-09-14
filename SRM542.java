public class SRM542 {

	public double getEfficiency(String[] profit) {

		long p = 0, q = 0;

		for (int i = 0; i < profit.length; i++) {
			for (int j = 0; j < i; j++) {
				p += profit[i].charAt(j) - '0';
				q += 1;
			}
		}

		return ((double) p) / q;
	}

}
