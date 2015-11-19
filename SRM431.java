public class SRM431 {
	public int count(int N) {
		int ans = 0;

		for (int i = 1; i <= N; i++) {
			if (Ts(i))
				ans++;
		}

		return ans;
	}

	boolean Ts(int num) {
		String s = num + "";

		for (int i = 2; i < s.length(); i++) {
			if (s.charAt(i) - s.charAt(i - 1) != s.charAt(i - 1)
					- s.charAt(i - 2))
				return false;
		}
		return true;

	}
}
