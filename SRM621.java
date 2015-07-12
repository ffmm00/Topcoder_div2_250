import java.util.Arrays;

public class SRM621 {

	public String sortingMethod(String[] stringList) {

		int n = stringList.length;

		String[] zis = new String[n];
		int a = 0;
		int b = 0;

		for (int i = 0; i < n; i++) {
			zis[i] = stringList[i];
		}

		Arrays.sort(zis);

		for (int i = 0; i < n; i++) {
			if (stringList[i] != zis[i]) {
				a++;
				break;
			}
		}

		for (int i = 0; i < n - 1; i++) {
			if (stringList[i].length() > stringList[i + 1].length()) {
				b++;
				break;
			}
		}

		if (a == 0 && b == 0)
			return "both";
		else if (a == 0 && b == 1)
			return "lexicographically";
		else if (a == 1 && b == 0)
			return "lengths";

		return "none";
	}

}
