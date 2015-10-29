public class SRM451 {

	public int find(int source, int A) {

		int i = 0;
		double temp = 0;

		while (temp <= A) {
			temp += Math.pow(10.0, i) * source;
			i++;
		}

		return (int) temp;
	}

}
