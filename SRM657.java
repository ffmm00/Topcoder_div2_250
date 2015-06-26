public class SRM657 {

	public String isCorrect(String[] board) {

		for (int i = 0; i < 8; i++) {
			int countW = 0;
			int countL = 0;
			for (int k = 0; k < 8; k++) {
				if (board[i].charAt(k) == 'R')
					countW++;
				if (board[k].charAt(i) == 'R')
					countL++;
			}
			if (countW != 1 || countL != 1)
				return "Incorrect";
		}

		return "Correct";

	}
}
