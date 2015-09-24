public class SRM527 {

	public String solve(String[] original, String[] target) {

		int n = target.length;

		if (n == 1 && original[0] != target[0])
			return "NO";

		int o0 = 0, t0 = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < original[0].length(); j++) {
				if (original[i].charAt(j) == '0')
					o0++;

				if (target[i].charAt(j) == '0')
					t0++;
			}
		}

		if (o0 == t0)
			return "YES";

		return "NO";
	}

}
