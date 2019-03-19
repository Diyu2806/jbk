package com.jbk;

import java.util.Scanner;

public class ScanInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String name;
	System.out.println("Enter the fnme");
	name=sc.next();
	
	
	System.out.println("Hello" + name);
}
}
