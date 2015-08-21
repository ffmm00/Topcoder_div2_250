import java.util.Arrays;

public class SRM579 {

	public int maxWins(int initialLevel, int[] grezPower) {

		Arrays.sort(grezPower);
		int c = 0;

		for (int i = 0; i < grezPower.length; i++) {
			if (initialLevel > grezPower[i]) {
				c++;
				initialLevel += grezPower[i] / 2;
			}

		}

		return c;
	}

}
