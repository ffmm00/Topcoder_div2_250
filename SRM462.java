public class SRM462 {

	public double expectedPoints(int N, int[] ringPoints) {

		int a = 0;

		for (int i = 0; i < ringPoints.length; i++) {
			a += (i * 2 + 1) * ringPoints[i];
		}

		return (double) a / (ringPoints.length * ringPoints.length);
	}

}
