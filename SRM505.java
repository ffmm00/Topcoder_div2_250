import java.util.Arrays;

public class SRM505 {

	public int[] find(int[] money, int jackpot) {

		while (jackpot != 0) {
			Arrays.sort(money);
			money[0]++;
			jackpot--;
		}
		
		Arrays.sort(money);

		return money;
	}

}
