public class SRM597 {

	public String getAnswer(int[] A) {

		for (int i = 0; i < A.length; i++) {
			while (A[i] % 2 == 0)
				A[i] /= 2;
		}

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] != A[i + 1])
				return "NO";
		}

		return "YES";

	}

}
