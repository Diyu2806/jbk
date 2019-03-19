package com.jbk;

import java.util.Scanner;

public class ChooseQue {
public static void main(String[] args) {
	String[] multiChoice1;
	Scanner sc=new Scanner(System.in);
	multiChoice1=new String[5];
	multiChoice1[0] = "1. Which optioncurrently emits the most greenhouse gases?\n";
    multiChoice1[1] = "blah blah";
    multiChoice1[2] = "blah blah";
    multiChoice1[3] = "blah blah";
    multiChoice1[4] = "blah blah";

    String userSelect1 = multiChoice1[0];

    if(userSelect1==multiChoice1[0]){
        System.out.println(multiChoice1[0]);
        System.out.println("A. int 1x=10;");
        System.out.println("B. int x=10;");
        System.out.println("C. float x=10.0f;");
        System.out.println("D. string x=10;");
        System.out.println();
        System.out.print("Your answer: ");
        String uSelect1 = sc.next();
        switch (uSelect1.toUpperCase()){
        case "A":
            uSelect1 = "A. int 1x=10;";
            System.out.println("Incorrect!\n\n");
            break;
        case "B":
            uSelect1 = "B. int x=10;";
            System.out.println("Correct!\n\n");
            
            break;
        case "C":
            uSelect1 = "C. float x=10.0f;";
            System.out.println("Incorrect!\n\n");
            break;
        case "D":
            uSelect1 = "D. string x=10;";
            System.out.println("Incorrect!\n\n");
            break;
        default: 
            uSelect1 = "Incorrect, choice.\n\n";
            break;
	
	
}
    }
}
}
