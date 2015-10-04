public class SRM507 {

	public int getMinimumSteps(int[] pos) {

		int ans = 0;

		for (int i = 0; i < pos.length; i++) {
			int tmp = pos[i];
			if (tmp == 6)
				ans = Math.max(ans, 3);
			else if (tmp == 1 || tmp == 3 || tmp == 4)
				ans = Math.max(ans, 1);
			else if (tmp == 0)
				;
			else
				ans = Math.max(ans, 2);
		}

		return ans;
	}

}
