public class SRM623 {

	public String ableToCatchAll(int[] x, int[] y) {

		for (int i = 0; i < x.length; i++) {
			int a = i;
			for (int m = i + 1; m < x.length; m++) {
				if (y[m] < y[a])
					a = m;
			}
			int one = x[i];
			int two = y[i];
			x[i] = x[a];
			y[i] = y[a];
			x[a] = one;
			y[a] = two;
		}

		int chara = 0;
		for (int i = 0; i < x.length; i++) {
			if (y[i] < Math.abs(x[i] - chara))
				return "Not able to catch";
			chara = x[i];
			for (int m = i + 1; m < x.length; m++)
				y[m] -= y[i];
		}

		return "Able to catch";
	}

}
