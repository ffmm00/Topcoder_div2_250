import java.util.Arrays;

public class SRM512 {

	public int maxLength(int R, int G, int B) {

		int co[] = { R, G, B };

		Arrays.sort(co);

		if (co[1] == co[2])
			return co[1] * 2;
		else
			return co[1] * 2 + 1;
	}

}
