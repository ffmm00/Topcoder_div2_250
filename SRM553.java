public class SRM553 {

	public int minimumAnimals(int webbedFeet, int duckBills, int beaverTails) {
		int c = 0;

		while (duckBills * 2 + beaverTails * 4 != webbedFeet) {
			c++;
			duckBills--;
			beaverTails--;
			webbedFeet -= 4;
		}

		return c + duckBills + beaverTails;

	}

}
