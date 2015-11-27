public class SRM410 {
	public static int bytesRead(int n, int k, int[] address) {

		int base = 0;
		int read = 0;

		for (int num : address) {
			if (n < base) {
				read += Math.min(base - n, k);
				base = num;
			} else if (num > base + k - 1) {
				read += Math.min(num - k + 1 - base, k);
				base = num - k + 1;
			}
		}

		return read;
	}

}
