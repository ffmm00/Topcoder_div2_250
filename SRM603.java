import java.util.ArrayList;

public class SRM603 {

	public String encode(String s) {

		char[] tm = s.toCharArray();

		ArrayList<Character> list = new ArrayList<>();

		for (char c : tm)
			list.add(c);

		String test = "";

		while (!list.isEmpty()) {
			int middle = list.size() / 2;

			if (list.size() % 2 == 1)
				test += list.remove(middle);

			else {
				if (list.get(middle) < list.get(middle - 1)) {
					test += list.remove(middle);
				} else
					test += list.remove(middle - 1);
			}

		}

		return test;
	}

}
