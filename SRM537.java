public class SRM537 {

	public String isValid(String name) {

		int a = 0, i = 0, u = 0, e = 0, o = 0;

		for (int k = 0; k < name.length(); k++) {
			switch (name.charAt(k)) {
			case 'a':
				a++;
				break;
			case 'i':
				i++;
				break;
			case 'u':
				u++;
				break;
			case 'e':
				e++;
				break;
			case 'o':
				o++;
				break;
			}
		}

		if (name.length() == 8 && a + i + u + e + o == 2
				&& (a == 2 || i == 2 || u == 2 || e == 2 || o == 2))
			return "YES";

		return "NO";
	}

}
