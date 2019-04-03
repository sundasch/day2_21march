package day2_21march_111099_fs;

import java.util.Scanner;
 
public class Main3 {

	public static void main(String[] args){
		
		System.out.println("Please enter number");
		Scanner scana = new Scanner(System.in);
		System.out.println("Please enter number");
		Scanner scanb = new Scanner(System.in);
		int num1 = scana.nextInt();
		int num2 = scanb.nextInt();	
		System.out.println("This is the result");
		System.out.println(UserMainCode3.compareLastDigit(num1, num2));
	}
	
	
	
	
}


class UserMainCode3{
	public static boolean compareLastDigit(int num1,int num2){
		 String numbers1 = Integer.toString(num1);
		 String numbers2 = Integer.toString(num2);
		  
		char digit1 = numbers1.charAt((numbers1.length() - 1));
		char digit2 = numbers2.charAt((numbers2.length() - 1));
		
		if(digit1 == digit2){
			return true;}
		else{
			return false;
		
	}
	
}}