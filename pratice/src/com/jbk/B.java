package com.jbk;

public class B extends A {
	int j;
	void dispaly() {
		System.out.println(j);
	}

}
class inheeritance_demo{
	public static void main(String[] args) {
		B obj=new B();
		obj.i=1;
		obj.j=2;
		obj.display();
	}
}
