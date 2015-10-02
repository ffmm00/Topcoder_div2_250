public class SRM510 {

	public int find(int a, int b) {

		int ans = 0;

		for (int i = a; i <= b; i++) {
			String s = Integer.toString(i);
			int no = 0;
			for (char c : s.toCharArray()) {
				if (c != '4' && c != '7')
					no++;
			}
			if (no <= 1)
				ans++;
		}

		return ans;
	}
}
