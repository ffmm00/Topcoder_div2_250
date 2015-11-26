import java.util.Arrays;

public class SRM414 {

	public static int allocateTables(int[] tables, int[] groupSize,
			int[] arrivals, int[] departures) {

		Arrays.sort(tables);
		int[] times = new int[tables.length];
		int ans = 0;

		for (int i = 0; i < groupSize.length; i++) {
			boolean test = false;
			for (int j = 0; j < tables.length; j++) {
				if (tables[j] >= groupSize[i] && arrivals[i] >= times[j]) {
					times[j] = departures[i];
					test = true;
					break;
				}
				if (!test)
					ans += groupSize[i];
			}
		}

		return ans;
	}

}
