import java.util.Arrays;

public class SRM562 {

	public String check(int[] price, int budget, int k) {

		Arrays.sort(price);

		int total = 0;

		for (int i = 0; i < k; ++i) {
			total += price[price.length - 1 - i];
		}

		return total <= budget ? "YES" : "NO";

	}

}
