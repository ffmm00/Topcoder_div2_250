import java.util.HashMap;
import java.util.Map;

public class SRM560 {

	public int minDistance(String keyboard, String word) {

		Map<Character, Integer> keys = new HashMap<Character, Integer>();

		for (int i = 0; i < keyboard.length(); i++) {
			Character chr = keyboard.charAt(i);
			keys.put(chr, i);
		}

		int dist = 0;
		char[] wordchr = word.toCharArray();
		int startpos = keys.get(wordchr[0]);

		for (int i = 1; i < wordchr.length; i++) {
			int endpos = keys.get(wordchr[i]);
			dist += Math.abs(startpos - endpos);
			startpos = endpos;
		}

		return dist;
	}
}
