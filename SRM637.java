public class SRM637 {

	public int calc(int[] snuke, int[] sothe) {

		int c = 0;
		for (int i = 0; i < snuke.length; i++) {
			if (snuke[i] > sothe[i])
				c++;
		}

		return c;
	}

}
