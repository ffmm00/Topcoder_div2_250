import java.util.HashMap;

public class SRM584 {

	public int possibleHandles(String familyName, String givenName) {

		int ans = 0;

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < familyName.length(); i++) {
			for (int k = 0; k < givenName.length(); k++) {
				String p1 = familyName.substring(0, i + 1);
				String p2 = givenName.substring(0, k + 1);

				map.put(p1 + p2, 1);
			}

		}

		return map.size();
	}
}
