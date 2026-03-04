class Demo{

	public static void main(String[] args){

		String name = "Rahul";

		//System.out.println(name.contains("h"));
		//System.out.println(name.indexOf("h"));
		//System.out.println(name.length());
		
		for(int i = 0; i<name.length(); i++){

			for(int j = i; j<name.length(); j++){


				System.out.println(name.substring(i,j+1));
			}
		}

		//System.out.println(name.substring(0,4));
	}
}
