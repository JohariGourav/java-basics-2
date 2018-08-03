
//class to find missing numbers among distinct no.s in arrray
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of  array");
		int n = scanner.nextInt();
		System.out.println("Enter n distinct numbers in array");
		int distinctNum[] = new int[n];
		for (int i = 0; i < n; i++) {
			distinctNum[i] = scanner.nextInt();
		}
		missingNumber(distinctNum);

	}

	static void missingNumber(int num[]) {
		int missNum = 0, sum = 0;
		int n = num.length;
		n = n * (n + 1) / 2;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println(num.length + " " + n + " " + sum);
		missNum = n - sum;
		System.out.println("Missing Number: " + missNum);
	}

}
