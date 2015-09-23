public class SRM528 {

	public int getMinimum(String s, int oCost, int xCost) {

		int n = s.length();
		char c[] = s.toCharArray();
		int ans = 0;

		for (int i = 0, j = n - 1; i < j; i++, j--) {
			if ((c[i] == 'o' && c[j] == 'x') || (c[i] == 'x' && c[j] == 'o'))
				return -1;

			else {
				if (c[i] == c[j] && c[i] != '?')
					continue;
				else if (c[i] == 'o' || c[j] == 'o')
					ans += oCost;
				else if (c[i] == 'x' || c[j] == 'x')
					ans += xCost;
				else
					ans += Math.min(oCost, xCost) * 2;

			}
		}

		return ans;
	}

}
