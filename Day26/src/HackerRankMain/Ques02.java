package HackerRankMain;

class SerialMultiplier {
	int arr[] = new int[5];
	int n = 0;

	public void input(int n, int arr[]) {
		this.n = n;
		this.arr = arr;
	}

	public String toString() {

		int prod = 1;
		for (int i = 0; i < n; i++) {
			prod *= arr[i];
		}

		return Integer.toString(prod);
	}

}

public class Ques02 {

}
