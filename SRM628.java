public class SRM628 {

	public int howManyMoves(int r1, int c1, int r2, int c2) {

		if (r1 == r2 && c1 == c2)
			return 0;

		if (Math.abs(r1 - r2) == Math.abs(c1 - c2))
			return 1;

		if ((Math.abs(r1 - r2) + Math.abs(c1 - c2)) % 2 == 1)
			return -1;

		return 2;
	}

}
