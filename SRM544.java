public class SRM544 {

	public String IsFraudulent(int[] per) {

		int sum = 0;
		int non = 0;

		for (int a : per) {
			sum += a;
			if (a > 0)
				non++;
		}

		if (sum > 100 - per.length * 0.5 && sum <= 100 + non * 0.5)
			return "NO";

		return "YES";
	}

}
