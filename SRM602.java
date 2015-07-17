public class SRM602 {

	public int count(int[] rating) {

		int cod = 0;
		int c = 0;

		for (int i : rating) {
			if (cod == 0 && i >= 1200) {
				cod++;
				c++;
			}
			if (cod == 1 && i < 1200) {
				cod = 0;
				c++;
			}
		}

		return c;
	}

}
