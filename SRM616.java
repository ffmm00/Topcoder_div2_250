public class SRM616 {

	public int countAlarms(int[] volume, int S) {

		int[] volume2 = new int[volume.length];
		int c = 0;

		while (S > 0) {
			for (int i = 0; i < volume.length; i++) {
				if (S <= 0)
					return c;

				S -= volume[i];
				c++;
			}
		}

		return c;

	}

}
