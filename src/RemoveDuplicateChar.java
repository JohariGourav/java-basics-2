
//Removing duplicate characters in a string
import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your word");
		String character = scanner.nextLine();

		removeDuplicateChar(character);
	}

	static void removeDuplicateChar(String ch) {
		int counter = 0;
		String Result = " ";
		char chTemp[] = new char[ch.length()];
		char chComp[] = new char[ch.length()];
		chTemp = ch.toCharArray();

		for (int i = 0; i < ch.length(); i++) {

			chComp[i] = ch.charAt(i);
			counter = 0;

			for (int j = 0; j < Result.length(); j++) {

				if (ch.charAt(i) == Result.charAt(j)) {
					counter++;
					break;
				}
			}

			if (counter == 0) {
				Result += ch.charAt(i);
			}
		}
		System.out.println(Result);
	}
}
