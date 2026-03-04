import java.util.Scanner;
import java.util.TreeMap;

class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		TreeMap<Integer, Integer> eleFreq = new TreeMap<Integer, Integer>();

		for (int i = 0; i < size; i++) {
			if (eleFreq.containsKey(arr[i])) {

				eleFreq.put(arr[i], eleFreq.get(arr[i]) + 1);

			} else {
				eleFreq.put(arr[i], 1);
			}
		}

		System.out.println(eleFreq);

		sc.close();
	}
}
