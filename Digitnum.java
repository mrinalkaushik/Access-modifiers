package day2project;

import java.util.Scanner;

public class Digitnum {

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);

		System.out.println("digits to words conversion");

		System.out.println("enter digit:");

		int y = myobj.nextInt();
		if (y == 0) {
			System.out.println("zero");
		} else if (y == 1) {
			System.out.println("one");
		} else if (y == 2) {
			System.out.println("two");
		} else if (y == 3) {
			System.out.println("three");
		} else if (y == 4) {
			System.out.println("four");
		} else if (y == 5) {
			System.out.println("five");
		} else if (y == 6) {
			System.out.println("six");
		} else if (y == 7) {
			System.out.println("seven");
		} else if (y == 8)

		{
			System.out.println("eight");
		} else if (y == 9) {
			System.out.println("nine");
		} else {
			System.out.println("not one digit number");
		}
	}

}
