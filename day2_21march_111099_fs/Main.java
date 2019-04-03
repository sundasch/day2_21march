package day2_21march_111099_fs;

import java.util.Scanner;

public class Main {
	int numberinput;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int numberinput = scan.nextInt();
		System.out.println(UserMainCode.SumOfSquaresOfEvenDigits(numberinput));
		
	}

}

class UserMainCode {
	public static int SumOfSquaresOfEvenDigits(int num) {
		String input = Integer.toString(num);
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			int result = Integer.parseInt(input.charAt(i) + "");
			if (result % 2 == 0) {
				sum += (result * result);
			}
		}
		return sum;
	}

}