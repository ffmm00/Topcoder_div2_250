import java.util.Arrays;

public class SRM425 {

	public static int getTheNumber(int[] n) {

		Arrays.sort(n);

		return n[0] * n[n.length - 1];
	}
}
