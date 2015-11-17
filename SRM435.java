public class SRM435 {

	public int bestPosition(String ski, String path) {

		int sum = 0;
		for (int i = 0; i < path.length() - ski.length(); i++) {
			int max = 0;
			for (int j = 0; j < ski.length(); j++) {
				int friction = path.charAt(j + i) - '0' + ski.charAt(j) - '0';
				max = Math.max(max, friction);
			}
			sum += max;
		}
		return sum;
	}

}
