/// Write a code to find the AP series where 
// 1. First number is given 
// 2. Nth number us given
// 3. Difference is Given
///

import java.util.Scanner;

class Code {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int n = sc.nextInt();
		int d = sc.nextInt();

		while (a != n) {

			System.out.print(a + " ");
			a += d;
		}

		System.out.println(n);
		sc.close();
	}
}
