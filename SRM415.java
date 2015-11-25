import java.util.Arrays;

public class SRM415 {

	public static int numberOfPostmarks(int[] price, int[] have) {

		int p = 0;
		int ans = 0;

		for (int i = 0; i < have.length; i++) {
			p += price[i];
		}

		Arrays.sort(price);

		for (int i = 0; i < price.length && price[i] <= p; i++) {
			p -= price[i];
			ans++;
		}

		return ans;
	}
}
