import java.util.Collections;
import java.util.HashSet;

public class SRM583 {

	public String minNumber(String num) {

		HashSet<String> ans = new HashSet<String>();
		ans.add(num);
		int n = num.length();

		for (int i = 1; i < n; i++)
			for (int k = 0; k < n; k++) {
				char[] ar = num.toCharArray();
				ar[i] = num.charAt(k);
				ar[k] = num.charAt(i);
				if (ar[0] != '0')
					ans.add(new String(ar));
			}

		return Collections.min(ans);
	}

}
