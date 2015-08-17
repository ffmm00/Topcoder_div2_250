public class SRM585 {

	public int calculate(int[] seq) {

		int ans = 1;
		for (int i = 1, prev = seq[0]; i < seq.length; i++) {
			int curr = seq[i];
			if (prev >= curr)
				ans++;
			prev = curr;
		}

		return ans;
	}

}
