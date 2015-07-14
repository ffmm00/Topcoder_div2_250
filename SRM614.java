public class SRM614 {

	public String makeMicroString(int A, int D) {

		String n = "";

		while (A >= 0) {
			n += A + "";
			A -= D;
		}

		return n;
	}

}
