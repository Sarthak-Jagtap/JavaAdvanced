package HackerRank;

public class Try {

	public static void main(String[] args) {
		String str = "abc@xyz.";
		String[] temp1 = str.split("\\.");

		if (temp1.length == 1 || temp1[1] == "") {
			System.out.println("emptyy");
		}else {
			System.out.println("Not emptyy");
		}

	}
}
