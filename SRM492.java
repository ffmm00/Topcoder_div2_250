public class SRM492 {

	public int determineProfit(int[] profit, int[] decay) {
		
		int a=0;
		
		for(int i=0;i<profit.length;i++)
			for(int j=0;j<decay.length;j++){
				if (i == j)
					continue;
				a=Math.max(a, profit[i]-decay[j]);
			}
		
		return a;
	}

}
