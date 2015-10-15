import java.util.Arrays;
import java.util.HashMap;

public class SRM484 {

	public int theNumber(String ans) {

		int card[][] = { { 1, 2, 3, 4, 5, 6, 7, 8 },
				{ 1, 2, 3, 4, 9, 10, 11, 12 }, { 1, 2, 5, 6, 9, 10, 13, 14 },
				{ 1, 3, 5, 7, 9, 11, 13, 15 } };

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 1; i <= 16; i++) {
			String temp = "";
			for (int j = 0; j < 4; j++) {
				temp += (Arrays.binarySearch(card[j], i) >= 0) ? "Y" : "N";
			}
			map.put(temp, i);
		}

		return map.get(ans);
	}

}
