public class SRM550 {

	public String isItPossible(String originalWord, String finalWord, int k) {

		int c = 0;

		for (int i = 0; i < finalWord.length(); i++) {
			if (originalWord.charAt(i) != finalWord.charAt(i))
				c++;
		}

		if (c <= k && (k - c) % 2 == 0)
			return "POSSIBLE";

		return "IMPOSSIBLE";
	}

}
