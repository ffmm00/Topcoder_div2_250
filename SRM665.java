public class SRM665 {

	public int construct(int a) {

		for (int i = 1; i <= 100; ++i) {
			int xor = a ^ i;
			String str = Integer.toString(xor);
			str = str.replaceAll("4", "");
			str = str.replaceAll("7", "");
			if (str.length() == 0 && i > a)
				return i;
		}

		return -1;
	}
}
