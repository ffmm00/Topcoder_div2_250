public class SRM576 {

	public int[] determineHumidity(int[] intensity, int L, int[] leftEnd) {

		int[] ans = new int[leftEnd.length];

		for (int i = 0; i < leftEnd.length; i++)
			for (int k = 0; k < L; k++) {
				int s = leftEnd[i] + k;
				ans[i] += intensity[s];
				intensity[s] = 0;
			}

		return ans;
	}

}
