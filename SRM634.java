public class SRM634 {

	public int countPeaks(int[] hei) {
		int c = 0;

		if (hei.length == 1)
			return 1;

		if (hei[0] > hei[1])
			c++;

		if (hei[hei.length - 2] < hei[hei.length - 1])
			c++;

		for (int i = 0; i < hei.length - 2; i++) {
			if (hei[i] < hei[i + 1] && hei[i + 1] > hei[i + 2])
				c++;

		}

		return c;
	}

}
