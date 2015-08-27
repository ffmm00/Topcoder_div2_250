public class SRM568 {

	public int find(int lower, int upper) {

		int count1 = 0;

		while (upper >= lower) {
			lower *= 10;
			lower++;
			count1++;
		}

		return count1;
	}

}
