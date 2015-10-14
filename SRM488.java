public class SRM488 {

	public int find(int n, int m, int j, int b) {

		int c = n;

		if (j > n)
			c++;

		if (b > n)
			c++;

		return c;
	}

}
