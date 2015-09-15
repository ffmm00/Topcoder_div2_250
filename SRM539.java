public class SRM539 {

	public int maxFamily(String[] fc, String[] mc, String[] sg) {

		boolean ok = false;
		int tv = 0;
		int rv = 0;

		for (int i = 0; i < sg.length; i++)
			for (int i2 = 0; i2 < fc.length; i2++)
				for (int i3 = 0; i3 < mc.length; i3++) {
					ok = true;
					tv = 0;

					for (int i4 = 0; i4 < sg[0].length(); i4++) {
						if (sg[i].charAt(i4) == 'Y') {
							if (fc[i2].charAt(i4) == 'N'
									|| mc[i3].charAt(i4) == 'N') {
								ok = false;
							}

							tv++;
						}
					}

					rv = Math.max(rv, ok ? tv + 2 : rv);
				}

		return rv;
	}

}
