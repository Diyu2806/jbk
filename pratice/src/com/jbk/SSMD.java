package com.jbk;

import java.util.Scanner;

public class SSMD {
	public static void main(String[] args) {
		int a,b,result,add,sub,mul;
		double div;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of firstnumber:");
		a=s.nextInt();
		System.out.println("Enter the vlue of secondnumber");
		b=s.nextInt();
		while(true) {
			System.out.println("Enter 1 for addition");
			System.out.println("Enter 2 for substraction");
			System.out.println("Enter 3 for muliplication");
			System.out.println("Enter 4 for diviion");
			System.out.println("Enter 5 for exit");
			result=s.nextInt();
			switch(result) {
			case 1:
				add=a+b;
				System.out.println("RESULT:"+add);
				break;
			case 2:
				sub=a-b;
				System.out.println("RESULT:"+sub);
				break;
			case 3:
				mul=a*b;
				System.out.println("RESULT:"+mul);
				break;
			case 4:
				div=( double) a / b;
				System.out.println("RESULT:"+div);
				break;
			case 5:
				
				System.exit(0);
				
			}
		}
		
	}
	
	

}
