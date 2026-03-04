
import java.util.Scanner;

class Code {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num3 % num1 == 0 && num3 % num2 == 0)
			System.out.println("Both");
		else if (num3 % num1 == 0)
			System.out.println(num1);
		else if (num3 % num2 == 0)
			System.out.println(num2);
		else
			System.out.println("None");

		sc.close();
	}
}
