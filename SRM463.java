public class SRM463 {

	public int theCount(int[] bunnies) {

		int n = 2;

		for (int i = 1; i < bunnies.length - 1; i++) {
			if (bunnies[i] - bunnies[i - 1] != bunnies[i + 1] - bunnies[i])
				n++;
		}

		return n;
	}

}
