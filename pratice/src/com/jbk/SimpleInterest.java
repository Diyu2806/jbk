package com.jbk;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	float p,r,t;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principal:");
	p=sc.nextFloat();
	System.out.println("Enter the rate:");
	r=sc.nextFloat();
	System.out.println("Enter the time:");
	t=sc.nextFloat();
	float si;
	si=(p*r*t)/100;
	System.out.println("Thesimple interest is:"+si);
}
}
