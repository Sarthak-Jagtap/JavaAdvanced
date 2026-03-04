class SignsAreSame{

	public static void main(String[] args){
		
		int num1 = 15;
		int num2 = -25;

		if((num1 ^ num2) > 0)
			System.out.println("Same sign");
		else
			System.out.println("Not Same sign");
	}
}
