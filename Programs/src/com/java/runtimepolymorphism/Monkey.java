package com.java.runtimepolymorphism;

public class Monkey extends Animal {

	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "Jumping";
	}
	public static void main(String[] args) {
		Animal obj1=new Monkey();
		String a=obj1.work();
		System.out.println("Monkey is "+a);
	}
	

}
