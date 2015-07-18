import java.util.Arrays;

public class SRM601 {

	public int getNumber(int[] bags, int K) {

		Arrays.sort(bags);

		int min = Integer.MAX_VALUE;

		for (int i = 0; i + K <= bags.length; i++) {
			min = Math.min(min, Math.abs(bags[i] - bags[i + K - 1]));
		}

		return min;
	}

}
