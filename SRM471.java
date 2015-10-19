public class SRM471 {

	public int containerSize(int N) {
		int c = 0;

		while (N > 0) {
			if (isPrime(N))
				c++;

			N /= 2;
		}

		return c;
	}

	boolean isPrime(int x) {
		if (x < 2)
			return false;

		if (x == 2)
			return true;

		for (int i = 2; i * i <= x; i++)
			if (x % i == 0)
				return false;

		return true;
	}

}
