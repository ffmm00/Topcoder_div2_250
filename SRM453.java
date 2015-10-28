public class SRM453 {

	public int find(int[] points) {

		int a = 0;

		for (int n : points)
			a += n;

		if (a % 2 != 0)
			return -1;

		return a / 2;
	}

}
