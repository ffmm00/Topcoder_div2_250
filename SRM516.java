public class SRM516 {

	public String reconstruct(String message) {

		String ans = "";
		int posO = message.indexOf('o');
		int posX = message.indexOf('x');

		boolean a = ((posO >= 0 && posO % 2 == 0) || (posX >= 0 && posX % 2 != 0));

		for (int i = 0; i < message.length(); i++) {
			ans += (a ? 'o' : 'x');
			a = !a;
		}

		return ans;
	}

}
