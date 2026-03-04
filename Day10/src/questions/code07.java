package questions;

import java.util.*;
import java.util.stream.Collectors;

public class code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Find max/min by custom comparator
		
		List<Player> list = Arrays.asList(
				new Player("King",18,15024),
				new Player("Rohit",45,11523),
				new Player("Dhoni",7,9568),
				new Player("Rahul",1,8451),
				new Player("Hardik",33,6545)
		);
		
		Optional<Player> minPlayer = list.stream()
				.min(new CompareByRuns());
		
		System.out.println(minPlayer);
		
		Optional<Player> maxPlayer = list.stream()
				.max(new CompareByRuns());
		
		List<Player> sortedList = list.stream()
				.sorted(new CompareByRuns())
				.collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		
	}
}
