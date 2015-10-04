import java.util.Arrays;

public class SRM506 {

	public int train(int[] at) {

		Arrays.sort(at);

		int atMax = at[at.length - 1];

		int ans = 0;

		for (int i = 0; i < at.length - 1; i++)
			ans += atMax - at[i];

		return ans;
	}

}
