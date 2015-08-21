public class SRM578 {

	public int[] getminmax(int N, int K) {

		int small = (K >= N) ? 0 : N - K;
		int big = (2 * N - K) / 2;

		return new int[] { small, big };
	}

}
