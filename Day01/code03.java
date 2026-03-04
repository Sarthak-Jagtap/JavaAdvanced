class SwapNumbers{

	public static void main(String[] args){

		int x = 10;
		int y = 20;

		System.out.println(x + " " + y);
		x = x ^ y;
		y = y ^ x;
		x = y ^ x;

		System.out.println(x + " " + y);
	}
}
