public class SRM486 {

	public String getMessage(String original) {

		String vowel = "[aiueo]";

		String[] words = original.split(" ");
		String ans = "";

		for (int i = 0; i < words.length; i++) {
			if (i != 0)
				ans += " ";

			if (words[i].replaceAll(vowel, "").equals("")) {
				ans += words[i];
			} else {
				String[] field = words[i].split(vowel);
				for (String a : field) {
					if (!a.equals(""))
						ans += a.charAt(0);
				}
			}
		}

		return ans;
	}

}
