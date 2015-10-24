public class SRM459 {

	public double getArea(int side, int K) {

		double ans = 0;
		double r = side / 2.0;

		for (int i = K; i >= 1; i--) {
			if (i == 1)
				ans += Math.PI * r * r;
			else
				ans += (Math.PI - 2) * r * r;
			r /= Math.sqrt(2);
		}

		return ans;
	}

}
