public class SRM667 {

	public int[] findPoint(int x1, int y1, int x2, int y2) {

		for (int x3 = -100; x3 <= 100; x3++) {
			for (int y3 = -100; y3 <= 100; y3++) {
				if (dis(x1, y1, x3, y3) > dis(x2, y2, x3, y3)) {
					return new int[] { x3, y3 };
				}
			}
		}

		return new int[] { 0, 0 };

	}

	public int dis(int a, int b, int c, int d) {

		return (a - c) * (a - c) + (b - d) * (b - d);

	}

}
