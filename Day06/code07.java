import java.util.*;

class Demo{

	public static void main(String[] ars){

		Scanner sc = new Scanner(System.in);
		
		try{
			int x = sc.nextInt();
			System.out.println(10/x);

			return;

		}catch(Exception e){

			System.out.println("In catch");
			return;
			
		}finally{

			System.out.println("In finally");
			System.out.println("Scanner object deleted");
			sc.close();
		}
	}
}
