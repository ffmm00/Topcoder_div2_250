public class SRM678 {
	public static int find(int[] door, int[] droids) {

		int temp = 0;
		int ans = -1;

		for (int i = 0; i < door.length; i++) {
			temp = 101;
			for (int j = 0; j < droids.length; j++) {

				if ((int) Math.abs(droids[j] - door[i]) < temp) {
					temp = (int) Math.abs(droids[j] - door[i]);
				}
			}
			if (temp > ans)
				ans = temp;
		}
		return ans;
	}

}
