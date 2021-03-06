public class SRM473 {

	public int[] animals(int heads, int legs) {

		if (legs % 2 != 0)
			return new int[] {};

		if (legs < heads * 2 || legs > 4 * heads)
			return new int[] {};

		return new int[] { 2 * heads - legs / 2, legs / 2 - heads };
	}

}
