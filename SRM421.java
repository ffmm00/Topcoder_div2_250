public class SRM421 {
	public static int trainingTime(int needTrain, int minPulse, int maxPulse,
			int trainChange, int restChange) {

		int p = minPulse;

		if (minPulse + trainChange > maxPulse)
			return -1;

		for (int i = 1;; i++) {
			if (p + trainChange > maxPulse) {
				p = Math.max(minPulse, p - restChange);
			} else {
				p += trainChange;
				needTrain--;

				if (0 == needTrain)
					return i;
			}
		}
	}
}
