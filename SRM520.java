import java.util.Arrays;

public class SRM520 {

	public int countCompetitors(int[] ratings, int K) {

		int rate = ratings[0];
		Arrays.sort(ratings);

		int first = Arrays.binarySearch(ratings, rate) % K;
		int ans = 0;

		for (int i = first; i < ratings.length; i += K) {
			if (ratings[i] > rate)
				ans++;
		}

		return ans;
	}

}
