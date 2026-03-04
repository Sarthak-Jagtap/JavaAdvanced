class PowerOfTwo{

	public static void main(String[] args){

		int num = 16;

		if((num & (num - 1)) == 0)
			System.out.println("Power of 2");
		else 
			System.out.println("Not power of 2");
	}
}
