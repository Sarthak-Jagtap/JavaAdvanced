
class Demo{

	public static void main(String arr[]){

		String str = "helle###world";
		String[] words = str.split("#");

		for(int i = 0; i<words.length; i++){

			System.out.print(words[i]);
		}
		System.out.println();
		System.out.println(words.length);
	}
}
