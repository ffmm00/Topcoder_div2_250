import java.util.Arrays;
import java.util.HashSet;

public class SRM575 {

	public int find(int[] seq) {

		HashSet<String> ans = new HashSet<String>();

		for (int i = 0; i < seq.length; i++)
			for (int k = i + 1; k < seq.length; k++) {
				int t = seq[i];
				seq[i] = seq[k];
				seq[k] = t;
				ans.add(Arrays.toString(seq));
				t = seq[i];
				seq[i] = seq[k];
				seq[k] = t;
			}

		return ans.size();
	}

}
