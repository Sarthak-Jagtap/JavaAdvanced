class SetNthBitTo1{

	public static void main(String[] args){

		int num = 9;
		
		int bitNo = 2;

		System.out.println(num | (1<<bitNo));
	}
}
