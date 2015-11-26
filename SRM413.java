public class SRM413 {

	public static double minTime(int length, int maxAcce, int maxVeloc) {

		double maxTime = (double) maxVeloc / maxAcce;
		double time;

		if (maxAcce * maxTime * maxTime <= length) {
			time = maxTime * 2 + (length - maxAcce * maxTime * maxTime)
					/ maxVeloc;
		} else {
			time = 2 * Math.sqrt((double) length / maxAcce);
		}

		return time;

	}

}
