package questions;


public class code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First non-repeated character in a string
		
		try {
			String str = "";
			
			Character firstNonRep = str.chars()
					.mapToObj(c -> (char) c)
					.filter(c -> str.indexOf(c) == str.lastIndexOf(c))
					.findFirst()
					.get();
			
			System.out.println(firstNonRep);
		}catch(Exception e) {
			System.out.println("No non repeating element");
		}
				
	}
}
