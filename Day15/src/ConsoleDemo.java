import java.io.Console;
import java.util.Arrays;

public class ConsoleDemo {
	public static void main(String[] args) {
		 Console con = System.console();
		 
		 if(con == null) {
			 System.out.println("Console not found");
		 }
		 
		 String name = con.readLine("Enter name");
		 char[] pass = con.readPassword("Enter password");
		 
		 con.printf("Welcome %s \n", name);
		 
		 Arrays.fill(pass, ' ');
	}
}
