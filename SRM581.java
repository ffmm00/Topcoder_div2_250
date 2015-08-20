public class SRM581 {

	public int minimumTurns(String cardFront) {

		int c = 0;

		if (cardFront.startsWith("B")) {
			for (int i = 2; i < cardFront.length(); i += 2) {
				if (cardFront.charAt(i) != 'B') {
					c++;
				}
			}
			for (int i = 1; i < cardFront.length(); i += 2) {
				if (cardFront.charAt(i) != 'W') {
					c++;
				}
			}
		}

		if (cardFront.startsWith("W")) {
			for (int i = 2; i < cardFront.length(); i += 2) {
				if (cardFront.charAt(i) != 'W') {
					c++;
				}
			}
			for (int i = 1; i < cardFront.length(); i += 2) {
				if (cardFront.charAt(i) != 'B') {
					c++;
				}
			}
		}

		return Math.min(c, cardFront.length() - c);
	}

}
