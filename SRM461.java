public class SRM461 {

	public int findMinimumTime(int[] trapX, int[] trapY) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < trapX.length; i++)
			min = Math.min(min, trapX[i] + trapY[i] - 2);

		return min;
	}

}
