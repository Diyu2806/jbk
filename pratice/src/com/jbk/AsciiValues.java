package com.jbk;

public class AsciiValues {
public static void main(String[] args) {
	String ch;
	int i;
	for(i=1;i<=122;i++) {
		ch=new Character((char)i).toString();
		System.out.println(i+"->"+ch+"\t");
	}
}
}
