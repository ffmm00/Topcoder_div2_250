import java.util.Scanner;

public class SRM660 {

	public String bestmod(String s, int k) {

		Scanner sca = new Scanner(System.in);

		int n = s.length();

		char[] c = s.toCharArray();
		char[] z = new char[n];

		for (int i = 0; i < n; i++) {
			char tmp = c[0];
			for (int j = 1; j < n; j++) {
				c[j - 1] = c[j];
			}

			c[n - 1] = tmp;

			int x = k;

			for (int j = 0; j < n; j++) {
				if (c[j] == 'a')
					z[j] = 'a';
				else if (x > 0) {
					x--;
					z[j] = 'a';
				} else
					z[j] = c[j];
			}
			String A = String.valueOf(z);
			if (s.compareTo(A) > 0) {
				s = A;
			}
		}

		return s;

	}
}
