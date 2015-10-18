import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SRM475 {

	public String getWinner(String[] names, String[] votes) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(votes[i]))
				continue;
			if (map.containsKey(votes[i]))
				map.put(votes[i], map.get(votes[i]) + 1);
			else
				map.put(votes[i], 1);

		}

		List<Integer> c = new ArrayList<Integer>(map.values());
		Collections.sort(c);
		Collections.reverse(c);

		if (c.isEmpty())
			return "";

		if (c.size() <= 1 || c.get(0) > c.get(1)) {
			int x = c.get(0);
			for (String s : votes) {
				if (map.get(s) == x)
					return s;
			}
		}

		return "";
	}

}
