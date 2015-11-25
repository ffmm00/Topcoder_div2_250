public class SRM417 {
	public static int getReversedSum(int a, int b) {

		int ans = rev(a) + rev(b);

		return rev(ans);
	}

	static int rev(int n) {
		String a = n + "";
		StringBuffer sb = new StringBuffer(a);

		sb = sb.reverse();

		a = sb.toString();

		return Integer.parseInt(a);
	}
}
