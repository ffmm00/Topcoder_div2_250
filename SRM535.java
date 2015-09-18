public class SRM535 {

	public int[] get(int AminusB, int BminusC, int AplusB, int BplusC) {

		int[] check = new int[3];

		check[0] = (AminusB + AplusB) / 2;
		check[1] = (BminusC + BplusC) / 2;
		check[2] = BplusC - check[1];

		if (check[0] - check[1] == AminusB && check[0] + check[1] == AplusB
				&& check[1] - check[2] == BminusC
				&& check[1] + check[2] == BplusC)
			return check;

		return new int[] {};
	}
}
