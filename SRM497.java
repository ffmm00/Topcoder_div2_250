public class SRM497 {

	public int[] designFilter(int[] sizes, String outcome) {

		boolean[] reject = new boolean[101];

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < sizes.length; i++) {
			if (outcome.charAt(i) == 'A') {
				min = Math.min(min, sizes[i]);
				max = Math.max(max, sizes[i]);
			} else
				reject[sizes[i]] = true;
		}

		for (int i = min; i <= max; i++) {
			if (reject[i])
				return new int[0];
		}

		return new int[] { min, max };
	}

}
