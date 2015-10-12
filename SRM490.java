public class SRM490 {

	public int countLuckyMoments(String[] moments) {

		int ans = 0;

		for (int i = 0; i < moments.length; i++) {
			char a = moments[i].charAt(0);
			char b = moments[i].charAt(1);
			char c = moments[i].charAt(3);
			char d = moments[i].charAt(4);

			if ((a == c && b == d) || (a == b && c == d) || (a == d && b == c))
				ans++;

		}

		return ans;
	}

}
