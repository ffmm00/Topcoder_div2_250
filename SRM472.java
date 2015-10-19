public class SRM472 {

	public int theMin(String room) {

		int n = 0;

		char[] c = room.toCharArray();

		for (int i = 0; i < room.length() - 1; i++) {
			if (c[i] == c[i + 1]) {
				c[i + 1] = 'Q';
				n++;
			}
		}

		return n;
	}

}
