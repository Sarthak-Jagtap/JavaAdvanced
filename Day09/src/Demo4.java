import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo4 {
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		System.out.println("Integer");
		int x = Integer.parseInt(br.readLine());
		System.out.println(x);
		
		System.out.println("Float");
		float f = Float.parseFloat(br.readLine());
		System.out.println(f);
		
		System.out.println("String");
		String str = br.readLine();
		System.out.println(str);
		
		br.close();

	}
}
