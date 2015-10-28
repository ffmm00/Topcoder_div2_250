import java.util.HashSet;

public class SRM453_5 {

	public int countTools(String[] need) {

		HashSet<String> set = new HashSet<String>();

		for (String s : need) {
			String[] sp = s.split(" ");
			for (String plus : sp)
				set.add(plus);
		}

		return set.size();
	}

}
