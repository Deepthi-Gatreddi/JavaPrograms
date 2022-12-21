package com.java.hierarchicalinheritance;

public class Programmer extends Employee {
	void bonus() {
		System.out.println("Bonus=10000");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer programmer=new Programmer();
		programmer.salary();
		programmer.bonus();

	}

}
