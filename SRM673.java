public class SRM673 {

	public int countRareNotes(int[] notes) {

		int[] c = new int[1001];
		int ans = 0;

		for (int i = 0; i < notes.length; i++) {
			c[notes[i]]++;
		}

		for (int i = 0; i < c.length; i++) {
			if (c[i] == 1)
				ans++;
		}

		return ans;

	}
}
