
public class SRM565 {

	public String[] build(int[] values) {

		int count[] = new int[10];

		for (int i = 0; i < values.length; i++)
			++count[values[i]];

		int height = 0;

		for (int x : count)
			height = Math.max(height, x + 1);

		String[] ans = new String[height];

		for (int i = height; i > 0; i--) {
			String temp = "";
			for (int k = 0; k < count.length; k++) {
				if (i <= count[k])
					temp += 'X';
				else
					temp += '.';
			}
			ans[height - i] = temp;

		}

		return ans;
	}

}
