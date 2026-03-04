package questions;

import java.util.Comparator;

public class CompareByRuns implements Comparator<Player>{
	public int compare(Player obj1, Player obj2) {
//		return Integer.compare(obj1.runs, obj2.runs);
		
		if(obj1.runs >= obj2.runs)
			return obj1.runs;
		else
			return obj2.runs;
	}
}