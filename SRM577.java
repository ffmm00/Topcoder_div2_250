public class SRM577 {

	public int getLength(String nickname) {

		int c = 0;

		nickname = nickname.replaceAll("i", "a");
		nickname = nickname.replaceAll("u", "a");
		nickname = nickname.replaceAll("e", "a");
		nickname = nickname.replaceAll("o", "a");
		nickname = nickname.replaceAll("y", "a");

		for (int i = 0; i < nickname.length() - 1; i++) {
			if (nickname.charAt(i) == 'a' && nickname.charAt(i + 1) == 'a')
				c++;

		}

		return nickname.length() - c;
	}

}
