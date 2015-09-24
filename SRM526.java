public class SRM526 {

	public int[] howMany(String answers) {

		int n = answers.length();

		int[] a = new int[3];

		for (int i = 0; i < n; i++)
			a[answers.charAt(i) - 'A']++;

		int[] ans = new int[n];

		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = 0; j <= 2; j++)
				if (a[j] != 0)
					temp++;
			ans[i] = temp;

			a[answers.charAt(i) - 'A']--;
		}

		return ans;
	}

}
