package com.tns.overloading;

public class OverloadDemo {

	public static void main(String[] args) {
		Overload ob = new Overload();
		System.out.println("sum of 10 and 20: "+ ob.add(10,20));
		System.out.println("sum of 2, 37 and 43: "+ ob.add( 2, 37, 43));
		System.out.println("sum of 3.4f, 55.7f and 89.9f: " +ob.add(3.4f, 55.7f, 89.9f));
		
		

	}

}
