package com.java.polymorphism;

public class Dog extends Animal implements Animal1 {
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "barks";
	}
	@Override
	public void setHungry(String hungry) {
		this.hungry = hungry;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Animal obj1=new Dog();
         Animal obj2=new Animal();
         Dog obj3=new Dog();
         obj1.setHungry("cake..");
         System.out.println(obj1.getHungry());
         obj2.setHungry("mango..");
         System.out.println(obj2.getHungry());
         String sou=obj3.sound();
         System.out.println(sou);
	}

}
