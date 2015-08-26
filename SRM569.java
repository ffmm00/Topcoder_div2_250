import java.util.Arrays;

public class SRM569 {

	public int countSupervisors(int[] students, int Y, int J) {

		int n = students.length;
		int min = Integer.MAX_VALUE;

		int[] studs = new int[n];

		for (int i = 0; i < n; i++) {
			studs = Arrays.copyOf(students, n);
			int sum = 0;
			studs[i] = Math.max(0, students[i] - Y);
			for (int k = 0; k < n; k++) {

				sum += (studs[k] / J);
				if (studs[k] % J > 0)
					sum++;
			}
			min = Math.min(min, sum);
		}

		return min;
	}

}
