package day2_21march_111099_fs;
import java.util.Scanner;

 class Main2 { 
	int numberinput;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int numberinput = scan.nextInt();
		System.out.println(UserMainCode2.countSeven(numberinput));
		
	}

}

class UserMainCode2 {
	public static int countSeven(int num) {
		int Digits=0;
		String number = Integer.toString(num);
		
		
		for (int i=0;i<number.length();i++){
			if(number.charAt(i)=='7'){
				Digits++;
			}
			
		}
		
		return Digits;
	}

}




