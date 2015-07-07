
public class SRM636 {

	public int count(int[] stones) {

		int sum = 0;

		for (int i = 0; i < stones.length; i++)
			sum += stones[i];

		if (sum % stones.length != 0)
			return -1;

		int com = sum / stones.length;
		int A = 0;

		for (int i = 0; i < stones.length; i++) {
			if (Math.abs(stones[i] - com) % 2 != 0)
				return -1;

			A += Math.abs(stones[i] - com) / 2;
		}

		return A / 2;

	}
}
