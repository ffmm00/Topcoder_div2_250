import java.util.Arrays;

public class SRM646 {

	public int find(int[] numbers, int k) {

		if (k == 1)
			return 0;

		Arrays.sort(numbers);

		int t = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length - 1; i++) {
			t = Math.min(t, numbers[i + 1] - numbers[i]);
		}

		return t - 1;
	}

}
