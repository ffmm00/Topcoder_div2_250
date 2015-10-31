public class SRM446 {

	public int count(int n, int lowerBound, int upperBound) {

		int from = (int) Math.pow(10, lowerBound - 1);
		int to = (int) Math.pow(10, upperBound) - 1;
		to = Math.min(n, to);

		return to + 1 >= from ? to - from + 1 : 0;
	}

}
