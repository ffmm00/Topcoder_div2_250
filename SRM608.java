public class SRM608 {

	public int finalPosition(String commands, int A, int B) {

		int n = 0;
		A *= -1;

		for (int i = 0; i < commands.length(); i++) {
			if (commands.charAt(i) == 'R' && n < B)
				n++;
			if (commands.charAt(i) == 'L' && n > A)
				n--;

		}

		return n;
	}

}
