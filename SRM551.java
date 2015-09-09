import java.util.Arrays;

public class SRM551 {

	public int countLayouts(String bricks) {

		int c = 1;

		char[] row = bricks.toCharArray();

		Arrays.sort(row);

		for (int i = 0; i < row.length - 1; i++) {
			if (row[i] != row[i + 1])
				c++;
		}

		if (c > 2)
			return 0;

		if (c == 1)
			return 1;

		return 2;
	}

}
