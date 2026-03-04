package questions;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class code08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Join strings with delimiter
		
				List<String> words = Arrays.asList(
						"hello","world","welcome","to","Java"
				);
				
				String sentence = words.stream()
						.collect(Collectors.joining(" "));
				
				System.out.println(sentence);
	}
}
