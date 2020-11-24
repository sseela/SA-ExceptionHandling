package com.cg.CustomException;

public class AnotherCustomException {
	public static void main(String[] args) {
		AnotherCustomException exception = new AnotherCustomException();
			exception.m1();
	}
	
	public void m1() {
		throw new Exc(); 
	}
}


/*class Exc extends Error {
	public Exc() {
		super("message");
	}
}*/

/*class Exc extends Throwable {
	public Exc() {
		super("message");
	}
}*/

class Exc extends NullPointerException {
	public Exc() {
		super("message");
	}
}