class FindMissingNumber{

	public static void main(String[] args){

		int[] arr = {1,2,4,5};

		int target = 0;
		int total = 0;

		for(int i = 1; i<=arr.length+1; i++){

			total = total ^ i;
		}

		for(int i = 0; i<arr.length; i++){

			target = target ^ arr[i];
		}

		System.out.println(total ^ target);
	}
}
