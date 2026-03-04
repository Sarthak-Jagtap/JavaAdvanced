import java.io.BufferedReader;
import java.io.InputStreamReader;

class Demo{

	public static void main(String[] args)throws Exception{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int sum = num1 + num2;

		System.out.println(sum);


		///Single Line input
		//We can directly use the split method of String.
		//
		//s.split(" "); 
		//will split with " " spaces;
		//
		String s = br.readLine();
		String arr[] = s.split(" ");
		int n1 = Integer.parseInt(arr[0]);
		int n2 = Integer.parseInt(arr[1]);

		System.out.println(n1 + n2);

	}
}
