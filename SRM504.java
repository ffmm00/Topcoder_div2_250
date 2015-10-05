public class SRM504 {

	public int makeProgram(int[] A, int[] B, int[] wanted) {

		int n = A.length;
		boolean ok1 = true, ok2 = true;

		for (int i = 0; i < n; i++) {
			if (wanted[i] != A[i])
				ok1 = false;
			if (wanted[i] != B[i])
				ok2 = false;
		}

		if (ok1 || ok2)
			return 1;

		ok1 = true;
		ok2 = true;

		for (int i = 0; i < n; i++) {
			if (wanted[i] != Math.min(A[i], B[i]))
				ok1 = false;
			if (wanted[i] != Math.max(A[i], B[i]))
				ok2 = false;
		}

		if (ok1 || ok2)
			return 7;

		return -1;
	}

}
