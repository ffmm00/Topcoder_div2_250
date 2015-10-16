import java.util.Arrays;

public class SRM480 {

	public long encrypt(int[] numbers) {

		Arrays.sort(numbers);

		numbers[0]++;

		long res = 1;
		for (int a : numbers)
			res *= a;

		return res;
	}

}
