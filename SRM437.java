import java.util.HashSet;

public class SRM437 {

	public int find(int n) {

		HashSet<Integer> digit = new HashSet<Integer>();

		while (n != 0) {
			digit.add(n % 10);
			n /= 10;
		}

		return digit.size();

	}

}
