class Demo{

	public static void main(String[] args){

		String name = "Rahul";

		//System.out.println(name.contains("h"));
		//System.out.println(name.indexOf("h"));
		//System.out.println(name.length());
		
		for(int i = 0; i<name.length(); i++){

			System.out.println(name.substring(i));
		}

		//System.out.println(name.substring(0,4));
	}
}
