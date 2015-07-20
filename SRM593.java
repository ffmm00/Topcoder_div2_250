public class SRM593 {

	public int calc(String str) {

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int A = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'c')
				count1++;
		}

		if (count1 % 2 != 0)
			return 0;

		if (count1 == 0)
			return str.length() - 1;

		for (int i = 0; i < str.length(); i++) {
			if (count2 == count1 / 2) {
				count3 = i;
				break;
			}
			if (str.charAt(i) == 'c')
				count2++;
		}

		for (int i = count3; i < str.length(); i++) {
			if (str.charAt(i) == '.')
				A++;
			else
				break;
		}

		return A + 1;
	}

}
