/*
 * MSB = Most Significant Bit 
 *
 * Means return the power of 2 which has them most greatest value for a number
 *
 * eg: 25 => 11001
 *   2 power 43210   
 *
 *   So most significant bit is 4
 *
 */

class MSB{
	public static void main(String[] args){

		int msb = 0;
		int num = 25;

		while(num>1){
			msb += 1;
			num = num >> 1;
		}

		System.out.println(msb);
	}
}
