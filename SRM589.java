
public class SRM589 {

	public int getmin(String S) {

		int x = Integer.MAX_VALUE;

		for (char c = 'a'; c <= 'z'; c++)
			x = Math.min(x, S.replaceAll(c + "", "").length());

		return x;
	}

}
