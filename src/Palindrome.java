//class to check a number is palindrome or not
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("Enter no. to check for palindrome");
		num=sc.nextInt();
		palindrome(num);
	}
	static void palindrome(int num) {
		int rem=0,rev=0,n;
		n=num;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			System.out.println(rev);
		}
		if(rev==num)
			System.out.println("No. is Palindrome");
		else
			System.out.println("No. is not Palindrome");
		
	}

}
