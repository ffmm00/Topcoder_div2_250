public class SRM412 {
	public static int calculateSpace(int[] sizes, int clusterSize) {

		int c = 0;

		for (int n : sizes) {
			c += (long) Math.ceil((double) n / clusterSize);
		}

		return c * clusterSize;
	}

}
