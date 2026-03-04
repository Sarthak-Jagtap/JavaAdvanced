package Questions;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Summary Statistics:
 * 
 * Find the Maximum, Minimum and Average of a list of integers using a single
 * Stream operation.
 * 
 * Use: IntSummaryStatistics via stream.maoToInt(x -> x).summaryStatistics().
 **/

public class Ques07 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		IntSummaryStatistics iss = list.stream().mapToInt(x -> x).summaryStatistics();
		
		System.out.println(iss);
	}
}
