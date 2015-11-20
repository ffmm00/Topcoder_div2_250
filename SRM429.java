public class SRM429 {
	public static String findCovering(String region) {

		String ans = region.replace("XXXX", "AAAA");
		ans.replaceAll("XX", "BB");

		if (ans.indexOf("X") >= 0)
			return "impossible";

		return ans;

	}
}