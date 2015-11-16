public class SRM436 {

	public int highestScore(String[] friends) {
		int N = friends.length;
		int Nums[] = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (friends[i].charAt(j) == 'Y') {
					Nums[i]++;
					Nums[j]++;
				} else {
					for (int k = 0; k < N; k++) {
						if (friends[i].charAt(k) == 'Y'
								&& friends[j].charAt(k) == 'Y') {
							Nums[i]++;
							Nums[j]++;
							break;
						}
					}
				}
			}
		}

		int ans = -1;

		for (int n : Nums) {
			ans = Math.max(ans, n);
		}

		return ans;

	}

}
