public class SRM552 {

	public int theMaxFlowers(String[] flowers, int r, int c) {

		char[][] ch = new char[flowers.length][];

		for (int i = 0; i < flowers.length; i++) {
			ch[i] = flowers[i].toCharArray();
		}

		int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

		for (int i = 0; i < r; i++)
			for (int j = 0; j < ch[0].length; j++)
				if (ch[i][j] == 'F')
					c1++;

		for (int i = r + 1; i < ch.length; i++)
			for (int j = 0; j < ch[0].length; j++)
				if (ch[i][j] == 'F')
					c2++;

		for (int i = 0; i < ch.length; i++)
			for (int j = 0; j < c; j++)
				if (ch[i][j] == 'F')
					c3++;

		for (int i = 0; i < ch.length; i++)
			for (int j = c + 1; j < ch[0].length; j++)
				if (ch[i][j] == 'F')
					c4++;

		return Math.max(c1, Math.max(c2, Math.max(c3, c4)));
	}

}
