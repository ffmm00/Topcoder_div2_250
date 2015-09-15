public class SRM538 {

	public int maxDistance(String p) {
		return Math.max(maxdis(p.replaceAll("\\?", "L")),
				maxdis(p.replaceAll("\\?", "R")));
	}

	public int maxdis(String a) {
		int pos = 0;
		int minp = 0;
		int maxp = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'L')
				pos--;
			else if (a.charAt(i) == 'R')
				pos++;

			minp = Math.min(minp, pos);
			maxp = Math.max(maxp, pos);
		}

		return Math.max(Math.abs(minp), maxp);
	}

}
