package com.jbk;

import java.util.Scanner;

public class Binaro2Decimal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a binary number");
	String binaryString=sc.nextLine();
	System.out.println("output:"+Integer.parseInt(binaryString,2));
	
}
}
