public class SRM572 {

	public String determineSign(int[] A) {

		long ans = 1;

		for (int a : A) {
			if (a > 0)
				a = 1;
			if (a < 0)
				a = -1;
			ans *= a;
		}

		if (ans > 0)
			return "POSITIVE";
		if (ans == 0)
			return "ZERO";
		if (ans < 0)
			return "NEGATIVE";

		return null;
	}

}
