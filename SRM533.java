public class SRM533 {

	public String check(String word) {

		word = word.replaceAll("pi|ka|chu", "");

		if (word.isEmpty())
			return "YES";

		return "NO";
	}

}
