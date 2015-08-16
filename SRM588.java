public class SRM588 {

	public int countDoors(int[] doorR, int[] doorG, int[] keys) {

		int c = 0;

		for (int i = 0; i < doorR.length; i++) {
			int a = Math.max(doorR[i] - keys[0], 0);
			a += Math.max(doorG[i] - keys[1], 0);
			if (a <= keys[2])
				c++;
		}

		return c;

	}

}
