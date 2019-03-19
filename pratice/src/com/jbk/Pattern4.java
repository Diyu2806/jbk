package com.jbk;

import java.util.Scanner;

public class Pattern4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(("how many rows you want in this pattern..!!"));
	int rows=sc.nextInt();
	int rowCount=1;
	System.out.println("here is your pattern");
	for(int i=rows;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("");
		}
		for(int j=1;j<=rowCount;j++) {
			System.out.print("*");
		}
		System.out.println();
		rowCount++;
	}
}
}
