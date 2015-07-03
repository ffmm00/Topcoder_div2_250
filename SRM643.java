public class SRM643 {

	public int getNumber(String[] state) {

		for (int i = 0; i < state.length; i++)
				if (state[i].contains("HH"))
					return 0;

		for (int i = 0; i < state.length - 1; i++)
			for (int m = 0; m < state[0].length(); m++) {
				if (state[i].charAt(m) == 'H' && state[i + 1].charAt(m) == 'H')
					return 0;
			}

		for (int i = 0; i < state.length; i++)
			for (int m = 0; m < state[0].length(); m++) {
				if (state[i].charAt(m) == 'H')
					return 1;
			}

		return 2;
	}

}
