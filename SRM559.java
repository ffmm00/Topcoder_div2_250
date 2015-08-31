public class SRM559 {

	public int getTallest(int[] block) {

		int ans = 0;

		for (int i = 0; i < block.length; i++) {

			int sum = 0;

			for (int k = 0; k <= i; k++)
				if (block[k] % 2 == 0)
					sum += block[k];

			for (int k = i; k < block.length; k++)
				if (block[k] % 2 == 1)
					sum += block[k];

			ans = Math.max(ans, sum);
		}

		return ans;
	}

}
