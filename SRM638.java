public class SRM638 {

	public String toCamelCase(String va) {

		String S = "";

		char[] c = va.toCharArray();

		for (int i = 0; i < va.length(); i++) {
			if (c[i] == '_')
				S += (c[++i] + "").toUpperCase();
			else
				S += c[i];
		}
		return S;
	}

}
