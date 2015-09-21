import java.util.Arrays;

public class SRM532 {

	public int minDucks(int[] ducks) {

		int c = 0;

		Arrays.sort(ducks);

		for (int i = ducks[0]; i < ducks[ducks.length - 1]; i++) {
			c++;
		}

		return c - ducks.length + 1;
	}

}
