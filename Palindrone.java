package day2project;

public class Palindrone {
	public static void main(String[] args) {
		int r, reverse = 0, x;
		int n = 121;

		x = n;
		while (n > 0) {
			r = n % 10;
			reverse = (reverse * 10) + r;
			n = n / 10;
		}
		if (x == reverse)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

}
