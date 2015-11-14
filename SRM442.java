import java.util.Arrays;
import java.util.HashSet;

public class SRM442 {

	public int points(String[] player, String[] dictionary) {

		HashSet<String> dict = new HashSet<String>(Arrays.asList(dictionary));
		HashSet<String> play = new HashSet<String>(Arrays.asList(player));

		int ans = 0;

		for (String s : play) {
			if (dict.contains(s)) {
				ans += score(s);
			}
		}

		return ans;

	}

	int score(String a) {
		int n = a.length();
		return n * n;

	}

}
