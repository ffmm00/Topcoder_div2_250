import java.util.Set;
import java.util.TreeSet;
public class SRM554 {

	public int find(int redCount, int redHeight, int blueCount, int blueHeight) {
		
		Set<Integer>set=new TreeSet<Integer>();
		
		for(int red=0;red<=redCount;red++)
			for (int d = -1; d <= 1; d++) {
			int blue=red+d;
				if(0<=blue&&blue<=blueCount){
					int height=red*redHeight+blue*blueHeight;
					if(height>0)
						set.add(height);
				}
			}
		
		return set.size();
	}

}
