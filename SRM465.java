public class SRM465 {

	public int numPairs(int[] numbers) {

		int ans = 0;

		for (int i = 0; i < numbers.length; i++)
			for (int j = i + 1; j < numbers.length; j++) {
				if (isNeigh(numbers[i], numbers[j]))
					ans++;
			}

		return ans;
	}

	boolean isNeigh(int a, int b) {
		int digitA[] = countDigit(a);
		int digitB[] = countDigit(b);

		for (int i = 1; i < 10; i++) {
			if (digitA[i] != digitB[i])
				return false;
		}
		return true;
	}

	int[] countDigit(int n) {
		int digit[] = new int[10];
		while (n != 0) {
			digit[n % 10]++;
			n /= 10;
		}
		return digit;
	}

}
