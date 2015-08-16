public class SRM587 {

	public String canTransform(String init, String goal) {

		goal = goal.replaceAll("z", "");

		if (init.equals(goal))
			return "Yes";

		return "No";
	}

}
