
//class to check palindrome for multiple no.s
import java.util.Scanner;

public class PalindromeChars {

	static void palindrome(int num[]) {

		int rev[] = new int[100];

		for (int i = 0; i < 10; i++) {

			int rem = 0, n;
			n = num[i];

			while (n > 0) {

				rem = n % 10;
				rev[i] = rev[i] * 10 + rem;
				n = n / 10;

			}
		}

		for (int i = 0; i < 10; i++) {

			if (rev[i] == num[i])
				System.out.println("No. " + rev[i] + " is Palindrome");
			else
				System.out.println("No. " + rev[i] + " is not Palindrome");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input[] = new int[10];
		System.out.println("Enter 10 inputs to check for palindrome");

		for (int i = 0; i < 10; i++) {
			input[i] = sc.nextInt();
		}
		palindrome(input);
	}

}
