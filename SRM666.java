public class SRM666 {

	public String canWin(int[] nextLevel) {
		int a = 0;

		int b = nextLevel[0];

		while (true) {
			a++;
			if (b == -1)
				return "Win";
			b = nextLevel[b];
			if (a == 51)
				break;
		}

		return "Lose";
	}

}
