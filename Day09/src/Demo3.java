

public class Demo3 {
	
	public static void main(String[] args) {

		StringBuffer result = new StringBuffer(new String("Hello from java"));
		System.out.println(result);
		for(int i = 0; i<result.length(); i++) {
			
			if(result.charAt(i) == ' ') {
				i++;
				Character ch = Character.toUpperCase(result.charAt(i));
				String caps = ch.toString();				
				result.replace(i, i+1, caps);
			}
		}
		System.out.println(result);
		
		int[] arr = {10,20,30};

	}
}
