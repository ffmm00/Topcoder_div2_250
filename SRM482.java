public class SRM482 {

	public double average(int[] numList) {

		int sum = 0;

		for (int a : numList) {
			sum += a;
		}

		double total = 0;

		for (int i = 1; i <= numList.length; i++) {
			total += (double) sum * C(numList.length - 1, i - 1) / i;
		}

		return total / (Math.pow(2, numList.length) - 1);
	}

	int C(int a, int b) {
		int res = 1;

		for (int i = a; i > a - b; i--)
			res *= i;

		for (int i = 1; i <= b; i++)
			res /= i;

		return res;

	}

}
