public class SRM629 {

	public int solve(int holeH, int holeW, int boardH, int boardW) {

		int h1 = Math.min(holeH, holeW);
		int h2 = Math.max(holeH, holeW);

		int b1 = Math.min(boardH, boardW);
		int b2 = Math.max(boardH, boardW);

		if (h1 == b1 && h2 == b2)
			return -1;

		if (h1 <= b1 && h2 <= b2)
			return 1;

		return -1;
	}
}
