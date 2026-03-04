class ToggleNthBit{

	public static void main(String[] args){

		int num = 3;
		
		// Nth bit in powers
		int p = 1;

		System.out.println(num ^ (1 << p));
	}
}
