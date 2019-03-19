package com.jbk;

import java.util.Scanner;

public class FirstVariable {
public static void main(String[] args) {
	float x,y;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the vaue of x:");
	x=sc.nextFloat();
	System.out.println("The value of x before adding:"+x);
	y=sc.nextFloat();
	x+=y;
	System.out.println("The value of x after adding:"+x);
}
}
