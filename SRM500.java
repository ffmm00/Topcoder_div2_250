import java.util.Arrays;

public class SRM500 {

	public int maxTurns(int[] cards) {

		Arrays.sort(cards);

		int ans = 0;
		int length = 1;

		for (int i = 1; i <= cards.length; i++) {
			if (i < cards.length && cards[i] == cards[i - 1] + 1)
				length++;
			else {
				ans += (length + 1) / 2;
				length = 1;
			}
		}

		return ans;
	}

}
