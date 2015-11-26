public class SRM418 {

	public static int attack(int myUnits, int hpT, int attackT, int numT) {
		int e = hpT * numT;

		for (int i = 1;; i++) {
			e -= myUnits;

			if (e <= 0)
				return i;

			myUnits -= (e + hpT - 1) / attackT * numT;

			if (myUnits <= 0)
				return -1;
		}

	}

}
