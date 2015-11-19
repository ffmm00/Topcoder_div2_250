import java.util.Arrays;

public class SRM433 {

	public int minimalArrangement(int[] A, int[] B) {

		int ans = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			ans += A[i] * B[A.length - i - 1];
		}

		return ans;
	}

}
