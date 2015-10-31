import java.util.Arrays;

public class SRM447 {

	public int maximalCost(int[] complexity, int[] computers) {

		int ans = 0;

		Arrays.sort(complexity);
		Arrays.sort(computers);
		int temp = 0;

		for (int i = 0; i < complexity.length && temp < computers.length;) {
			if (computers[temp++] >= complexity[i]) {
				i++;
				ans++;
			}
		}

		return ans;
	}

}
