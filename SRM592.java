import java.util.Arrays;

public class SRM592 {

	public int getNumber(int[] pages, int number) {

		Arrays.sort(pages);

		int A = 0;

		pages[number - 1] = 0;

		for (int i = 0; i <= number; i++) {
			A += pages[i];
		}

		return A;

	}

}
