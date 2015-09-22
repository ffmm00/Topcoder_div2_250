import java.util.Arrays;

public class SRM531 {

	public int[] getUnsorted(int[] s) {

		Arrays.sort(s);
		int i = s.length - 1;

		while (i > 0) {
			if (s[i] > s[i - 1]) {
				int temp = s[i];
				s[i] = s[i - 1];
				s[i - 1] = temp;
				break;
			}
			--i;
		}
		return i > 0 ? s : new int[0];
	}

}
