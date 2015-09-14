public class SRM543 {

	public int getMax(String places) {

		int v = 0, c = 0;

		for (int i = 0; i < places.length(); i++) {
			if (places.charAt(i) == 'V')
				v++;
			else
				c++;
		}

		int ans = 0;
		int min = Math.min(v, c);
		int max = Math.max(v, c);

		if (min == 0 && max != 0)
			return 1;
		else if (min != 0 && max != 0) {
			ans = 2 * min;
			if (min != max)
				ans++;
		}

		return ans;

	}

}
