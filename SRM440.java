public class SRM440 {

	public double giravitationalAcceleration(int[] height, int T) {
		double sum = 0;

		for (int h : height) {
			sum += Math.sqrt(h);
		}

		return sum * sum * 2 / T / T;

	}

}
