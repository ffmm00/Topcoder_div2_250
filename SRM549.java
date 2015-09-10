public class SRM549 {

	public int getHat(String hats, int numSwaps) {

		int pos = 0;

		for (pos = 0; hats.charAt(pos) != 'o' && pos < 3; pos++)
			;

		if (numSwaps == 0)
			return pos;

		int r = numSwaps % 2;

		if (pos == 1)
			return r == 0 ? 1 : 0;
		else
			return r == 0 ? 0 : 1;

	}

}
