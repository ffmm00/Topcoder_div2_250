public class SRM466 {

	public String buy(int p, int b1, int b2, int b3, int b4) {

		for (int a = 0; a <= 1; a++)
			for (int b = 0; b <= 1; b++)
				for (int c = 0; c <= 1; c++)
					for (int d = 0; d <= 1; d++) {
						if (b1 * a + b2 * b + b3 * c + b4 * d == p)
							return "POSSIBLE";
					}

		return "IMPOSSIBLE";
	}
}
