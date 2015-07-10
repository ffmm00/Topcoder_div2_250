public class SRM625 {

	public int[] makeExpression(int y) {

		int a, b, c;

		if (y <= 5)
			a = -2;
		else
			a = 2;

		b = 2;
		c = y - (a * b);

		return new int[] { a, b, c };

	}
}
