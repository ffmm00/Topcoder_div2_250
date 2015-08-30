public class SRM563 {

	public String isPossible(String S, String T) {

		for (int i = 0; i < S.length(); i++) {
			if ((S.substring(0, i) + S + S.substring(i)).equals(T))
				return "Yes";
		}

		return "No";
	}

}
