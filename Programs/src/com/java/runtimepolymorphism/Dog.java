package com.java.runtimepolymorphism;

public class Dog extends Animal{
	
	@Override   //overriding is a way to achieve the runtimepolymorphism
	public String work() {
		// TODO Auto-generated method stub
		return "barking";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1=new Dog();
		String a=obj1.work();
		System.out.println("Dog is "+a);
	}

}
