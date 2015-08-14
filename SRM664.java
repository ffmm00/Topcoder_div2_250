public class SRM664 {

	public String eyesight(int A, int B) {

		String a = A + "";
		String b = B + "";
		int c = 0;

		for (int i = 0; i < keta(A); i++) {
			if (a.charAt(i) == b.charAt(i))
				c++;
		}

		if (c == keta(A) || c + 1 == keta(A))
			return "happy";

		return "glasses";
	}

	public int keta(int x) {
		return Integer.toString(x).length();
	}

}
