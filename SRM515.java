import java.util.HashSet;

public class SRM515 {

	public int getFortunate(int[] a, int[] b, int[] c) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int aa : a) {
			for (int bb : b) {
				for (int cc : c) {
					int n = aa + bb + cc;
					if (isFortunate(n)) {
						set.add(n);
					}
				}
			}
		}

		return set.size();
	}

	boolean isFortunate(int num) {
		while (num != 0) {
			int digit = num % 10;
			if (digit != 5 && digit != 8) {
				return false;
			}
			num /= 10;
		}
		return true;
	}

}
