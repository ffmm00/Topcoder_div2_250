import java.util.Arrays;

public class SRM627 {

	public int howManySquares(int[] sticks) {
		int c = 1;
		int A = 0;

		Arrays.sort(sticks);

		for (int i = 0; i < sticks.length - 1; i++) {
			if (sticks[i] == sticks[i + 1])
				c++;
			else {
				A += c / 4;
				c = 1;
			}
		}

		return A + c / 4;

	}

}
