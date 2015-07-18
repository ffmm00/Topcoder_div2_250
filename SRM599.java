import java.util.Arrays;

public class SRM599 {

	public int maxMikan(int[] mikan, int weight) {

		Arrays.sort(mikan);
		int count = 0;

		for (int i = 0; i < mikan.length; i++) {
			weight += mikan[i];
			count++;
			if (weight > 5000) {
				count--;
				break;
			}
			if (weight == 5000)
				break;
		}

		return count;
	}

}
