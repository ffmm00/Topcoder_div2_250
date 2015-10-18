public class SRM474 {

	public int count(String A, String B) {
		int c = 0;
		for (int i = 0; i <= A.length(); i++) {
			String s = A.substring(0, i) + B + A.substring(i);
			if (Palid(s))
				c++;
		}

		return c;
	}

	boolean Palid(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}

}
