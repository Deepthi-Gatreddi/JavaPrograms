package com.java.compiletimepolymorphism;

public class Animal {
	//compile time polymorphism is achieved by overloading in java
	public void work() {
		System.out.println("you are working...");
	}
	//changing return type doesn't indicate compile time polymorphism
	//1)overloading by changing the number of parameters
	public void work(String name) {
		System.out.println(name+" is working");
	}
	//2)overloading by changing the data type of the variables
	public void work(int name) {
	    System.out.println("your numerical name is "+name);
	}
	//3)we can also do overloading by changing the sequence of the parameters

  public static void main(String args[]) {
	  Animal a=new Animal();
	  a.work();
	  a.work("cat");
	  a.work(3120);
  }
  }
