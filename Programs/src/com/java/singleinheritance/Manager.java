package com.java.singleinheritance;

public class Manager extends Employee{
	void bonus() {
	System.out.println("Bonus=5000");
	}

	public static void main(String[] args) {
		Manager obj=new Manager();
		obj.salary();
		obj.bonus();

	}

}
