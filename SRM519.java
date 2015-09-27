import java.util.Arrays;

public class SRM519 {

	public String getDay(String[] notOnThisDay) {

		String[] week = { "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday" };

		Arrays.sort(week);
		Arrays.sort(notOnThisDay);

		for (int i = 0; i < notOnThisDay.length; i++) {
			if (!week[i].equals(notOnThisDay[i])) {
				return week[i];
			}
		}

		return week[6];
	}

}
