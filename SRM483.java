public class SRM483 {

	public int numHoles(int number) {

		int[] holes = { 1, 0, 0, 0, 1, 0, 1, 0, 2, 1 };

		int num = 0;

		while (number != 0) {
			num += holes[number % 10];
			number /= 10;
		}

		return num;
	}

}
