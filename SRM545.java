public class SRM545 {

	public int restoreY(int[] A) {

		for (int i = 0; i < A.length; i++) {
			int check = 1048575;
			for (int j = 0; j < A.length; j++) {
				if (i == j)
					continue;
				check &= A[j];
			}

			if (check == A[i])
				return A[i];
		}

		return -1;
	}

}
