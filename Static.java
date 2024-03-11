package com.Constructor;

public class Static {

	Static(){
		System.out.println("Constructor");
	}
	void m1(){
		System.out.println("M1");
	}
	
	{ 
		System.out.println("Normal Block");
    }
 static {
	System.out.println("Static Block");
}

public static void main(String[] args) {
	Static s = new Static();
	s.m1();
	
}

}



