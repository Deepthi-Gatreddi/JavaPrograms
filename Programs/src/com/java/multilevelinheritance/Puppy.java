package com.java.multilevelinheritance;

public class Puppy extends Dog{
	void sad() {
		System.out.println("crying...");
	}
	public static void main(String args[]) {
		Puppy one=new Puppy();
		one.sad();
		one.bark();
		one.eat();
	}

}
