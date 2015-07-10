public class SRM626 {

	public int findSum(int[] array) {

		int A = 0;

		for (int x = 0; x < array.length; x++)
			for (int y = 0; y < array.length; y++)
				for (int z = x; z <= y; z++)
					A += array[z];


		return 	A;
	}

}
