public class SRM450 {

	public int setMemory(String mem) {

		int n = 0;
		char bit = '0';

		for (int i = 0; i < mem.length(); i++) {
			if (mem.charAt(i) != bit) {
				n++;
				bit = (char) ('0' + '1' - bit);
			}
		}

		return n;
	}

}
