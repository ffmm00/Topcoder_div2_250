public class SRM652 {

	public int findValue(String s) {
		int[] b = new int[28];
		int A = 0;
		int tm = 0;

		for (int i = 0; i < s.length(); i++) {
			b[s.charAt(i) - 'a']++;
		}
		

		for (int i = 0; i < b.length; i++) {
			tm += b[i];
			A += tm * (i + 1) * b[i];
		}
		
		return A;
	}

}
