package com.jbk;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want in this pattern...!!!");
		int rows=sc.nextInt();
		for(int i=rows;i>=1;i--) {
			for(int j=rows;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
