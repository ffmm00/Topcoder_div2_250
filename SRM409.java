public class SRM409 {
	public static int piece(int x) {

		int t = 64;
		int ans = 0;

		while (t != 0) {
			ans += x / t;
			x %= t;
			t /= 2;
		}

		return ans;
	}

}
