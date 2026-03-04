
class Demo{

	static int reverseNumber(long num){
        long rev = 0;
        while(num > 0){
            rev = num%10 + rev * 10;
            num/=10;
        }

	System.out.println(rev);

	if(rev > 2147483647)
		return 0;
        return (int)rev;
    }

    public static int reverse(int x) {
        if(x>0){
            return reverseNumber((long)x);
        }else{
            return -1 * reverseNumber((long)x * -1);
        }
    }

	public static void main(String[] args){

		System.out.println(reverse(1534236469));	
	}
}

