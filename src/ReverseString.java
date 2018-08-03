
//Reverse letters in words of a string
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String input = scanner.nextLine();

		ReverseString(input);

	}

	static void ReverseString(String str) {
		String words[] = str.split(" ");
		String reverseString = "";

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {

				reverseWord += word.charAt(j);
			}
			reverseString += reverseWord + " ";
		}
		System.out.println(reverseString);
	}
}
