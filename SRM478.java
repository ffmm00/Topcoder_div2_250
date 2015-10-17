public class SRM478 {

	public int[] thePouring(int[] capa, int[] bottles, int[] fromId, int[] toId) {

		for (int i = 0; i < fromId.length; i++) {
			int pour = Math.min(bottles[fromId[i]], capa[toId[i]]
					- bottles[toId[i]]);
			bottles[fromId[i]] -= pour;
			bottles[toId[i]] += pour;

		}

		return bottles;
	}

}
