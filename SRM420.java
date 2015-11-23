public class SRM420 {
	public static String rearrange(String deck, int[] above) {

		String ans = "";

		for (int i = 0; i < deck.length(); i++) {
			ans = ans.substring(0, above[i]) + deck.charAt(i)
					+ ans.substring(above[i]);
		}

		return ans;
	}

}
