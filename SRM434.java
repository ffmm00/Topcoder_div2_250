public class SRM434 {
	public int leastMajorityMultipie(int a, int b, int c, int d, int e) {

		for (int i = 4;; i++) {
			int count = 0;
			if (i % a == 0)
				count++;
			if (i % b == 0)
				count++;
			if (i % c == 0)
				count++;
			if (i % d == 0)
				count++;
			if (i % e == 0)
				count++;

			if (count > 2)
				return i;

		}
	}

}
