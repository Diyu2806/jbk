package com.jbk;

import java.util.Scanner;

public class Exercise3 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Input an integer number between 0 and 100");
	int num=input.nextInt();
	int firstDigit=num%10;
	int remainingNumber=num%10;
	int SecondDigit=remainingNumber/10;
	remainingNumber=remainingNumber%10;
	int thirdDigit=remainingNumber%10;
	int sum=thirdDigit+SecondDigit+firstDigit;
	System.out.println("The sum of all digits in"+"num"+"is"+sum);
	
}
}
