public class SRM534 {

	public String[] getFiles(String[] files) {
		int pos[] = new int[2];

		int index = 0;

		for (int i = 0; i < files.length; i++) {
			if (files[i].equals(".") || files[i].equals("..")) {
				pos[index] = i;
				index++;
			}
		}

		if (pos[0] < files.length - 2) {
			swap(files, pos[0], files.length - 1);
			if (pos[1] == files.length - 1) {
				swap(files, pos[0], files.length - 2);
			} else
				swap(files, pos[1], files.length - 2);
		}

		return files;
	}

	void swap(String[] f, int a, int b) {
		String temp = f[a];
		f[a] = f[b];
		f[b] = temp;
	}

}
