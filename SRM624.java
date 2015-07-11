import java.util.Arrays;

public class SRM624 {

	public int minimum(int K, int[] danceCost) {
		int A = 0;

		Arrays.sort(danceCost);

		for (int i = 0; i < K; i++)
			A += danceCost[i];

		return A;
	}

}
