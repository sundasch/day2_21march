package day2_21march_111099_fs;

import java.util.Scanner;

public class BattingKeeping {
	public static void main(String[] args) {
		
		String availability;
		System.out.println("Are you available");
		
		Scanner scan = new Scanner(System.in);
		availability = scan.next();
		
		if(availability.equalsIgnoreCase("yes"))
			System.out.println("keeping");
		else if (availability.equalsIgnoreCase("no"))
			System.out.println("Batting");
		else 
			System.out.println("Invalid Input");
	}
	
}
