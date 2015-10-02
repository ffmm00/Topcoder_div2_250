public class SRM511 {

	public String theSimulation(String init, int T) {

		int n = init.length();

		int state[] = new int[init.length()];

		for (int i = 0; i < n; i++)
			state[i] = init.charAt(i) - '0';

		for (int i = 0; i < T; i++) {
			int nextState[] = new int[n];
			for (int j = 0; j < n; j++) {
				nextState[j] = (state[(j - 1 + n) % n] + state[j]
						+ state[(j + 1) % n] >= 2 ? 1 : 0);
			}
			state = nextState;
		}

		String ans = "";
		for (int a : state)
			ans += a;

		return ans;
	}
}
