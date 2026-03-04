///Armstrong number

import java.util.Scanner;

class Code {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int len = 0;

		int temp = num;
		while (temp > 0) {

			temp /= 10;
			len++;
		}

		int sum = 0;
		temp = num;

		while (temp > 0) {

			sum += (temp % 10) * len;
			temp /= 10;
		}

		if (sum == num)
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");

	}
}
