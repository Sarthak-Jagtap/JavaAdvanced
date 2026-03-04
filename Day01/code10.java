class FindSingleOccurNumberOfArr{

	public static void main(String[] args){

		int[] arr = {1,2,3,4,3,2,1};

		int singleOcc = 0;

		for(int i = 0; i<arr.length; i++){

			singleOcc = singleOcc ^ arr[i];
		}

		System.out.println(singleOcc);
	}
}
