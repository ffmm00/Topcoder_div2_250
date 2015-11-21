import java.util.Arrays;

public class SRM427 {
	public static String findBoy(String girl, String[] boys) {

		Arrays.sort(boys);

		int Lg = 0, Og = 0, Vg = 0, Eg = 0;
		double tes = -1;
		String s = "";

		for (int i = 0; i < girl.length(); i++) {
			if (girl.charAt(i) == 'L')
				Lg++;
			if (girl.charAt(i) == 'O')
				Og++;
			if (girl.charAt(i) == 'V')
				Vg++;
			if (girl.charAt(i) == 'E')
				Eg++;
		}

		for (int i = 0; i < boys.length; i++) {
			int Lb = 0, Ob = 0, Vb = 0, Eb = 0;
			for (int j = 0; j < boys[i].length(); j++) {
				if (boys[i].charAt(j) == 'L')
					Lb++;
				if (boys[i].charAt(j) == 'O')
					Ob++;
				if (boys[i].charAt(j) == 'V')
					Vb++;
				if (boys[i].charAt(j) == 'E')
					Eb++;
			}
			double per = ((Lg + Lb + Og + Ob) * (Lg + Lb + Vg + Vb)
					* (Lg + Lb + Eg + Eb) * (Og + Ob + Vg + Vb)
					* (Og + Ob + Eg + Eb) * (Vg + Vb + Eg + Eb)) % 100;

			if (per > tes) {
				tes = per;
				s = boys[i];
			}
		}

		return s;

	}
}
