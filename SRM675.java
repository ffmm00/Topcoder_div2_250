import java.util.Scanner;

public class SRM675 {
	public static double calc(int amount, String from, String to) {

		Scanner sca = new Scanner(System.in);
		String from2 = from;

		double ans = amount;
		double ans2 = amount;
		int c1 = 0;
		int c2 = 0;

		if (from.equals("in"))
			c1++;
		if (from.equals("ft"))
			c1 += 2;
		if (from.equals("yd"))
			c1 += 3;
		if (from.equals("mi"))
			c1 += 4;

		if (to.equals("in"))
			c2++;
		if (to.equals("ft"))
			c2 += 2;
		if (to.equals("yd"))
			c2 += 3;
		if (to.equals("mi"))
			c2 += 4;

		if (from.equals("mi") && !to.equals(from)) {
			ans *= 1760;
			from = from.replaceAll("mi", "yd");
		}
		if (from.equals("yd") && !to.equals(from)) {
			ans *= 3;
			from = from.replaceAll("yd", "ft");
		}
		if (from.equals("ft") && !to.equals(from)) {
			ans *= 12;
			from = from.replaceAll("ft", "in");
		}

		if (from2.equals("in") && !to.equals(from2)) {
			ans2 /= 12;
			from2 = from2.replaceAll("in", "ft");
		}
		if (from2.equals("ft") && !to.equals(from2)) {
			ans2 /= 3;
			from2 = from2.replaceAll("ft", "yd");
		}
		if (from2.equals("yd") && !to.equals(from2)) {
			ans2 /= 1760;
			from2 = from2.replaceAll("yd", "mi");
		}

		if (c1 > c2)
			return ans;
		else
			return ans2;
	}

}
