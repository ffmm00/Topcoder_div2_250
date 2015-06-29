import java.util.HashSet;
import java.util.Set;

public class SRM650 {

	public int getNumber(int A, int B) {

		Set<Integer> divid = new HashSet<Integer>();

		int R = 0;

		divid.add(A);

		while (A % 2 == 0) {
			A /= 2;
			divid.add(A);
		}

		if (divid.contains(B))
			R++;

		while (B % 2 == 0) {
			B /= 2;
			if (divid.contains(B))
				R++;
		}

		return R;
	}

}
