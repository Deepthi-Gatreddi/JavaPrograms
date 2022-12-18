package com.java.hierarchicalinheritance;

public class Manager extends Employee{
	void bonus() {
		System.out.println("Bonus=5000");
		}

		public static void main(String[] args) {
			Manager manager=new Manager();
			manager.salary();
			manager.bonus();

		}
}
