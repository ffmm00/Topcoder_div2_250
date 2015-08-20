public class SRM582 {

	public String check(int N) {

		for (int i = 1; i * i * i <= N; i++) {
			for (int k = i + 1; i * k * k <= N; k++) {
				if (i * k * k == N)
					return "Yes";
			}
		}

		return "No";
	}

}
