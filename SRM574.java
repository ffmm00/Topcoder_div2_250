import java.util.HashMap;

public class SRM574 {

	public String getLegend(String[] cityMap, int[] POIs) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (String s : cityMap)
			for (char c : s.toCharArray()) {
				if (c != '.') {
					Integer cnt = map.get(c);
					if (cnt == null)
						cnt = 0;
					cnt++;
					map.put(c, cnt);
				}
			}

		HashMap<Integer, Character> map2 = new HashMap<Integer, Character>();

		for (Character a : map.keySet()) {
			map2.put(map.get(a), a);
		}

		String ans = "";

		for (int i : POIs) {
			ans += map2.get(i);
		}

		return ans;
	}

}
