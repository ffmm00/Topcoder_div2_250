import java.util.HashMap;
import java.util.Iterator;

public class SRM669 {

	public int maxHappiness(int[] h, String[] s) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < s.length; i++) {
			if (map.containsKey(s[i])) {
				map.put(s[i], Math.max(h[i], map.get(s[i])));
			} else
				map.put(s[i], h[i]);
		}

		Iterator<Integer> itr = map.values().iterator();
		int c = 0;

		while (itr.hasNext()) {
			c += itr.next();
		}

		return c;
	}

}
