public class SRM591 {

	public double minimumChange(int a, int b, int c) {

		double d = b - a;
		double e = c - b;

		if (d == e)
			return 0.0;

		double ans = Math.abs(d - e);

		return ans / 2;
	}

}
