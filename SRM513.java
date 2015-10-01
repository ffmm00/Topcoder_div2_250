public class SRM513 {

	public String[] determineSolvers(String[] attend, String[] problem) {

		String ans[] = new String[attend.length];

		for (int i = 0; i < attend.length; i++) {
			ans[i] = "";
			for (int j = 0; j < problem.length; j++) {
				boolean ok = true;
				for (int k = 0; k < problem[0].length(); k++) {
					if (problem[j].charAt(k) == 'X'
							&& attend[i].charAt(k) == '-') {
						ok = false;
						break;
					}
				}
				ans[i] += ok ? "X" : "-";
			}
		}

		return ans;
	}

}
