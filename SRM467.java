public class SRM467 {

	public int calculate(int k, int n) {

		return superSum(k, n);
	}

	int superSum(int a, int b) {
		if (a == 0)
			return b;

		int r = 0;

		for (int i = 1; i <= b; i++)
			r += superSum(a - 1, i);

		return r;
	}

}
