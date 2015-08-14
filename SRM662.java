public class SRM662 {

	public String decode(long ciphertext) {

		String res = Long.toHexString(ciphertext).toUpperCase();
		res = res.replaceAll("1", "I");
		res = res.replaceAll("0", "O");

		if (res.matches("[ABCDEFIO]*"))
			return res;

		return "Error!";
	}

}
