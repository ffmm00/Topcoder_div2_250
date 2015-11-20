public class SRM430 {
	public static int minChanges(int[] groupes, int minSize, int maxSize) {
		int sum = 0;
		int exc = 0;
		int lac = 0;

		for (int i = 0; i < groupes.length; i++) {
			sum += groupes[i];
			if (groupes[i] > maxSize) {
				exc += groupes[i] - maxSize;
			} else if (groupes[i] < minSize) {
				lac += minSize - groupes[i];
			}
		}

		if (sum < minSize * groupes.length || sum > maxSize * groupes.length)
			return -1;

		return Math.max(exc, lac);
	}
}