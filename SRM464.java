public class SRM464 {

	public int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue,
			int bothColors) {

		int ans = numRed * onlyRed + numBlue * onlyBlue;
		int plus = bothColors * 2 - (onlyRed + onlyBlue);

		if (plus > 0)
			return ans + plus * Math.min(numRed, numBlue);
		else
			return ans;
	}
}
