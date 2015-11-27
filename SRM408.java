public class SRM408 {
	public static int getPoints(int[] raw, int[] factory) {

		int ans = 0;

		for (int i = 0; i < raw.length; i++) {
			ans += Math.round((double) raw[i] / factory[i]);
		}

		return ans;
	}

}
