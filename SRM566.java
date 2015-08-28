public class SRM566 {

	public int findMaximumMatching(String colors) {

		if (colors.length() <= 1)
			return 0;

		for (int i = 0; i < colors.length() - 1; i++) {
			if (colors.charAt(i) == colors.charAt(i + 1)) {
				return 1 + findMaximumMatching(colors.substring(0, i)
						+ (i + 2 < colors.length() ? colors.substring(i + 2): ""));
			}
		}

		if (colors.charAt(0) == colors.charAt(colors.length() - 1)) {
			return 1 + findMaximumMatching(colors.substring(1,
					colors.length() - 1));
		}

		return Math.max(findMaximumMatching(colors.substring(1)),
				findMaximumMatching(colors.substring(0, colors.length() - 1)));
	}

}
