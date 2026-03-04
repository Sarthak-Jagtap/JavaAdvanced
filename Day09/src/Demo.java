
public class Demo {
	public static void main(String[] args) {
		String str = new String("Hello from java");
		
		String[] words = str.split(" ");
		
		StringBuffer result = new StringBuffer();
		for(int i = 0; i<words.length ; i++) {
			StringBuffer str1 = new StringBuffer(words[i]).reverse().append(" ");
			result = result.append(str1);
		}
		
		System.out.println(result);	
	}
}
