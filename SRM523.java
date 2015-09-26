public class SRM523 {

	public String doesItExist(String[] lM) {
		int x = -1;
		int y = -1;
		boolean foundA = false;

		for (int i = 0; i < lM.length; i++) {
			for (int j = 0; j < lM[0].length(); j++) {
				if (lM[i].charAt(j) == 'A') {
					x = i;
					y = j;
					foundA = true;
					break;
				}
			}
			if (foundA)
				break;
		}

		int X[] = { -1, 0, 1, 0 };
		int Y[] = { 0, 1, 0, -1 };

		for (int i = 1; i < 26; i++) {
			boolean found = false;
			for (int j = 0; j < 4; j++) {
				int nextX = x + X[j];
				int nextY = y + Y[j];

				if (nextX >= 0 && nextY >= 0 && nextX < lM.length
						&& nextY < lM[0].length()
						&& lM[nextX].charAt(nextY) == 'A' + i) {
					x = nextX;
					y = nextY;
					found = true;
					break;
				}
			}
			if (!found)
				return "NO";
		}

		return "YES";
	}

}
