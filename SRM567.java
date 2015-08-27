public class SRM567 {

	public int countOpponents(int P, int K) {

		int c = 0;

		while (true) {
			int total = c / K;
			total *= 3;
			total += c / 3;
			if (total == P)
				return c;
			if (total > P)
				return -1;
			c++;

		}

	}

}
