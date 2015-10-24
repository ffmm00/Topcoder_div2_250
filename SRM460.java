import java.util.HashMap;

public class SRM460 {

	public int find(String[] que) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < que.length; i++) {
			map.put(que[i], 1);
		}

		return 1 << map.size();
	}

}
