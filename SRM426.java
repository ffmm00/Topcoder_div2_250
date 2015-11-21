public class SRM426 {
	public static int meetRival(int N, int you, int rival) {

		for (int i = 1;; i++) {
			you = (you + 1) / 2;
			rival = (rival + 1) / 2;
			if (you == rival)
				return i;
		}
	}
}
