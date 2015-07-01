public class SRM648 {

	public int numBought(int K, int T) {

		return (int) (Math.log((T + K) / K) / Math.log(2.0));

	}

}
