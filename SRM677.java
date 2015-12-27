public class SRM677 {
	public static int count(int L, int R) {

		int ans = 0;
		if (L == 1)
			ans -= 3;

		for (int i = L; i <= R; i++) {
			if (sosu(i) && palid(i))
				ans++;
		}

		return ans;
	}

	static boolean sosu(int n) {

		for (int i = 3; i < n; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;

	}

	static boolean palid(int n) {
		String s = "" + n;

		if (new StringBuffer(s).reverse().toString().equals(s)) {
			return true;
		}

		return false;
	}

}
