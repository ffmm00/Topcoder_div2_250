import java.util.Arrays;

public class SRM570 {

	public int getmax(int[] length) {

		Arrays.sort(length);

		int c = 0;

		for (int i = 0; i < length.length - 1; i++) {
			if (length[i] == length[i + 1]) {
				c++;
				length[i + 1] = -2;
			}
		}

		return c;
	}

}
